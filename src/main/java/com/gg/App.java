package com.gg;

import com.gg.data.HibernateUtil;
import com.gg.entities.Users;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanA beanA = applicationContext.getBean("myBean",BeanA.class);
        BeanA beanA1 = applicationContext.getBean("myBean",BeanA.class);
       Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Users user = new Users("Nick","Heitfield","m@megadeth.com");
        session.save(user);
        session.getTransaction().commit();
        session.close();
        HibernateUtil.getSessionFactory().close();
        System.out.println(beanA.getMyBeanB().getName());
        System.out.println(beanA1.getMyBeanB().getName());
        System.out.println(beanA == beanA1);
    }
}
