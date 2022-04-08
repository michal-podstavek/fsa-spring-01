package sk.posam.fsa.spring;


import sk.posam.fsa.spring.domain.Actor;
import sk.posam.fsa.spring.domain.Category;
import sk.posam.fsa.spring.domain.Film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;

public class SandBoxStarter {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dvdrental-pu-name");
        EntityManager em = factory.createEntityManager();

        Film film = em.find(Film.class, 10L);
        System.out.println(film.getActors());

        Actor actor = em.find(Actor.class, 10L);
        System.out.println(actor.getFilms());


//        printEntities(em, "Actor");
//        printEntities(em, "Category");
//        printEntities(em, "Film");
//        printEntities(em, "Language");

        // create new todo
        em.getTransaction().begin();
        Category category = new Category();
        category.setName("This is a test");
        category.setLastUpdated(new Date());
        em.persist(category);
        em.getTransaction().commit();

        em.close();
    }

    private static void printEntities(EntityManager em, String entityName) {
        // read the existing entries and write to console
        Query query = em.createQuery("select e from "+entityName+" e");
        List entities = query.getResultList();
        for (Object entity : entities) {
            System.out.println(entity);
        }
        System.out.println("Size: " + entities.size());
    }
}
