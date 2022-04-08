package sk.posam.fsa.spring.application;

import sk.posam.fsa.spring.domain.Actor;
import sk.posam.fsa.spring.domain.repositories.ActorRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ActorRepositoryImpl implements ActorRepository {

    private EntityManagerFactory entityManagerFactory;

    public ActorRepositoryImpl() {
    }

    public ActorRepositoryImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public Actor read(long id) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Actor actor = em.find(Actor.class, id);

        return actor;
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
}
