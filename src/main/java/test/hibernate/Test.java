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
       /* UserEntity userEntity = new UserEntity();
        userEntity.setName("jack212");
        userEntity.setGoal(1);
        userEntity.setId(1L);
        userEntity.setTotal(1);
        session.save(userEntity);*/
        UserEntity userEntity = session.load(UserEntity.class,1L);
        System.out.println(userEntity.getGoal());
        System.out.println(userEntity.getName());
        userEntity.setGoal(userEntity.getGoal() + 10 );
        session.getTransaction().commit();
        session.close();
    }
}
