package test.hibernate.lesson3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import test.hibernate.lesson3.entity.Currency;
import test.hibernate.lesson3.entity.Price;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Price product = new Price();
        product.setAmount(125d);
        product.setCurrency(Currency.USD);


        em.getTransaction().begin();

        em.persist(product);

        em.getTransaction().commit();
    }
}
