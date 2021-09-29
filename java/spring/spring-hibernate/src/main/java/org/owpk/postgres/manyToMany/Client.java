package org.owpk.postgres.manyToMany;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
   public static void main(String[] args) {
      SessionFactory factory = new Configuration().configure("postgresManyToMany/hibernate.cfg.xml")
            .buildSessionFactory();
      Session session = factory.openSession();
      session.beginTransaction();

      Query query = session.createNamedQuery("Product.getAll", Product.class);
      List<Product> list = query.getResultList();
      System.out.println(list);

      Query query2 = session.createQuery("Select p.name from Product p");
      List l = query2.getResultList();

      System.out.println("-----------------------");
      System.out.println(l);
      System.out.println("-----------------------");

      session.getTransaction().commit();
      session.close();

      // В случае FetchType.LAZY мы получим LazyInitializationException
      System.out.println(list.get(1).getCategories());
   }

}
