package test.hibernate.lesson2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import test.hibernate.lesson2.entitites.Event;
import test.hibernate.lesson2.entitites.Product;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();
        Event event = new Event();
        event.setDescription("fewtw");

        em.getTransaction().begin();

        em.persist(event);

        em.getTransaction().commit();

    }
}
