package org.owpk.postgres.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class Client {
  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("postgreOneToMany/hibernate.cfg.xml").buildSessionFactory();
    Session session = factory.openSession();
    session.beginTransaction();
    Query query = session.createQuery("SELECT p FROM Product p LEFT OUTER JOIN p.category c WHERE c.name = 'Book'");
    List<Product> p = query.getResultList();
    System.out.println(p);
  }

}
