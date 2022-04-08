package sk.posam.fsa.spring;


import sk.posam.fsa.spring.application.ActorRepositoryImpl;
import sk.posam.fsa.spring.application.FilmArchiveServiceImpl;
import sk.posam.fsa.spring.application.FilmRepositoryImpl;
import sk.posam.fsa.spring.domain.FilmArchiveService;
import sk.posam.fsa.spring.domain.repositories.ActorRepository;
import sk.posam.fsa.spring.domain.repositories.FilmRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BezSpringuStarter {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dvdrental-pu-name");

        ActorRepository actorRepository = new ActorRepositoryImpl(factory);
        FilmRepository filmRepository = new FilmRepositoryImpl(factory);
        FilmArchiveService filmArchiveService = new FilmArchiveServiceImpl(actorRepository, filmRepository);

        System.out.println(filmArchiveService.hralHerecVoFilme(142L, 10L));
        System.out.println(filmArchiveService.hralHerecVoFilme(143L, 10L));
    }
}
