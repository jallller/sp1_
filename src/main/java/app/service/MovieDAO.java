package app.service;

import app.Entitys.Movie;
import app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MovieDAO {
    public void save(Movie movie) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(movie);
            tx.commit();
        }
    }

    public List<Movie> getAllMovies() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Movie", Movie.class).list();
        }
    }
}

