package com.flamexander.hibernate.config;

import com.flamexander.hibernate.crud.SimpleItem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConfigApp {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
            .addAnnotatedClass(SimpleItem.class)
            .buildSessionFactory(); Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            SimpleItem newSimpleItem = new SimpleItem("Dragon statue", 100000);
            session.save(newSimpleItem);
            session.getTransaction().commit();
        }
    }
}
