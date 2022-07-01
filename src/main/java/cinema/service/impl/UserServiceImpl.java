package cinema.service.impl;

import cinema.dao.UserDao;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final PasswordEncoder encoder;
    private final UserDao userDao;
    private final Logger logger;

    public UserServiceImpl(PasswordEncoder encoder, UserDao userDao,RoleService roleService) {
        this.encoder = encoder;
        this.userDao = userDao;
        this.logger = LogManager.getLogger(UserServiceImpl.class);
    }

    @Override
    public User add(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userDao.add(user);
    }

    @Override
    public User get(Long id) {
        Optional<User> user = userDao.get(id);
        if (user.isEmpty()) {
            logger.error("User with id " + id + " not found");
            throw new RuntimeException("User with id " + id + " not found");
        }
        return user.get();
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}
