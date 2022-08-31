package test.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import test.hibernate.entities.UserEntity;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
            .createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        UserEntity userEntity = new UserEntity();
        userEntity.setId(8L);
        userEntity.setTotal(123);
        userEntity.setName("Jackwasup");


        try
        {
            em.getTransaction().begin();
            em.persist(userEntity); // adding the instance in the context
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }

    }
}
