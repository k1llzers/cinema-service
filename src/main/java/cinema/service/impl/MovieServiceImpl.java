package cinema.service.impl;

import cinema.dao.MovieDao;
import cinema.model.Movie;
import cinema.service.MovieService;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;
    private final Logger logger;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
        this.logger = LogManager.getLogger(MovieServiceImpl.class);
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        Optional<Movie> movie = movieDao.get(id);
        if (movie.isEmpty()) {
            logger.error("Can't get movie by id " + id);
            throw new RuntimeException("Can't get movie by id " + id);
        }
        return movie.get();
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
