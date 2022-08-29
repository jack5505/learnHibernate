package test.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class HibernateConnector {
    private static HibernateConnector me;
    private Configuration cfg;
    private SessionFactory sessionFactory;

    private HibernateConnector() {
        cfg = new Configuration();
        cfg.setProperty("hibernate.connection.driver_class","org.postgresql.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/amu");
        cfg.setProperty("hibernate.connection.username", "postgres");
        cfg.setProperty("hibernate.connection.password", "postgres");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.hbm2dll.auto", "create-drop");


        cfg.addResource("employee.hbm.xml");

        sessionFactory = cfg.buildSessionFactory();
    }

    public static synchronized HibernateConnector getInstance(){
        if(me == null){
            me = new HibernateConnector();
        }
        return me;
    }
    public Session getSession(){
        Session session = sessionFactory.openSession();
        if(!session.isConnected()){
            this.reconnect();
        }
        return session;
    }
    private void reconnect(){
        this.sessionFactory = cfg.buildSessionFactory();
    }

}
