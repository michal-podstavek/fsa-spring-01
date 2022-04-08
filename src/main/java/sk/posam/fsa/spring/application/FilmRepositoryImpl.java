package sk.posam.fsa.spring.application;

import sk.posam.fsa.spring.domain.Film;
import sk.posam.fsa.spring.domain.repositories.FilmRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class FilmRepositoryImpl implements FilmRepository {

    private EntityManagerFactory entityManagerFactory;

    public FilmRepositoryImpl() {
    }

    public FilmRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public Film read(long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Film film = em.find(Film.class, id);

        return film;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
}
