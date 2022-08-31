package test.hibernate.lesson3;

import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import test.hibernate.lesson3.entity.Address;
import test.hibernate.lesson3.entity.Company;
import test.hibernate.lesson3.entity.Currency;
import test.hibernate.lesson3.entity.Price;
import test.hibernate.lesson3.entity.Products;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        Company company = new Company();
        company.setName("Jakhongir");
        Address address = new Address();
        address.setCity("Tashkent");
        address.setNumber("12");
        company.setAddress(address);

        em.getTransaction().begin();

        em.persist(company);

        em.getTransaction().commit();
    }
}
