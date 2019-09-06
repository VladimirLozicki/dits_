package com.devincubator.zamoiski.dits.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtilTest {

    private static volatile HibernateUtilTest hibernateUtil;

    private SessionFactory sessionFactoryTest;

    private HibernateUtilTest() {
        sessionFactoryTest =
                new MetadataSources(
                        new StandardServiceRegistryBuilder()
                                .configure("hibernate.cfg.test.xml")
                                .build()
                ).buildMetadata().buildSessionFactory();
    }

    public static synchronized HibernateUtilTest getInstance() {
        if (hibernateUtil == null) {
            hibernateUtil = new HibernateUtilTest();
        }
        return hibernateUtil;
    }

    public Session getSession() {
        return sessionFactoryTest.openSession();
    }
}
