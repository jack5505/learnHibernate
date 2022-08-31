package test.hibernate.lesson4;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import test.hibernate.lesson4.entity.Address;
import test.hibernate.lesson4.entity.Companyies;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Companyies company = new Companyies();
        company.setName("Jakhongir Testlash");
        Address address = new Address();
        address.setCity("Urgench");
        address.setNo("12");
        address.setStreet("M.Xorazim");
        company.setAddress(address);

        em.getTransaction().begin();
        em.persist(company);
        em.getTransaction().commit();

    }
}
