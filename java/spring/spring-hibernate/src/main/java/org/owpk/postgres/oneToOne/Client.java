package org.owpk.postgres.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class Client {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration().configure("postgresOneToOne/hibernate.cfg.xml").buildSessionFactory();
    Session session = factory.openSession();
    session.beginTransaction();
    Query query = session.createQuery("Select e from Employee e");
    List<Employee> list = query.getResultList();
    session.getTransaction().commit();
    list.forEach(x -> System.out.println(x + " : " + x.getDetail()));
  }
}
