package com.gg.data;

import com.gg.entities.Users;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by salih on 12.06.2016.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Users.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());

        }catch (Exception e) {
            e.printStackTrace();

            throw new RuntimeException("Could not init session factory");
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}
