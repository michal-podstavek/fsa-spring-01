package sk.posam.fsa.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sk.posam.fsa.spring.annotationsandbox.OvocnySad;
import sk.posam.fsa.spring.annotationsandbox.OvocnySadService;
import sk.posam.fsa.spring.domain.Actor;
import sk.posam.fsa.spring.domain.FilmArchiveService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class ApplicationContext03Starter {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ctx03/application-context.xml");


        OvocnySad ovocnySad = context.getBean(OvocnySad.class);
        OvocnySadService service = context.getBean(OvocnySadService.class);

        System.out.println(ovocnySad);
        System.out.println(service);
    }


}
