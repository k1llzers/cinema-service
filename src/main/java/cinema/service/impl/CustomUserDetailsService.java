package cinema.service.impl;

import cinema.model.User;
import cinema.service.UserService;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;
    private final Logger logger;

    @Autowired
    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
        logger = LogManager.getLogger(CustomUserDetailsService.class);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userByEmail = userService.findByEmail(username);
        if (userByEmail.isPresent()) {
            User user = userByEmail.get();
            UserBuilder builder
                    = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(user.getPassword());
            builder.authorities(user.getRoles().stream()
                    .map(role -> "ROLE_" + role.getName().getRole())
                    .toArray(String[]::new));
            return builder.build();
        }
        logger.error("User not found by username: " + username);
        throw new UsernameNotFoundException("User not found by username: " + username);
    }
}
