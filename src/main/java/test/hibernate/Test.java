package test.hibernate;

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
        System.out.println("Hello world");
        Session session = HibernateConnector.getInstance().getSession();
        session.beginTransaction();
        UserEntity userEntity = new UserEntity();
        userEntity.setName("jack212");
        userEntity.getProteinEntity().setGoal(1);
        userEntity.setId(2L);
        userEntity.getProteinEntity().setTotal(12);
        session.save(userEntity);
        session.getTransaction().commit();
        session.close();
    }
}
