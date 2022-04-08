package sk.posam.fsa.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sk.posam.fsa.spring.domain.Actor;
import sk.posam.fsa.spring.domain.FilmArchiveService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ApplicationContext02Starter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ctx02/application-context.xml");

        EntityManagerFactory entityManagerFactory = context.getBean(EntityManagerFactory.class);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Actor actor = entityManager.find(Actor.class, 9L);
        System.out.println(actor);


        FilmArchiveService filmArchiveService = context.getBean(FilmArchiveService.class);
        System.out.println(filmArchiveService.hralHerecVoFilme(142L, 10L));
        System.out.println(filmArchiveService.hralHerecVoFilme(143L, 10L));
    }


}
