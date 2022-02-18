package owpk.servlet;

import owpk.Global;
import owpk.ejb.MessageDrivenEjbExample;
import owpk.ejb.StatefulEjbExample;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

   @EJB
   private StatefulEjbExample statefulEjbExample;

   @Override
   public void contextInitialized(ServletContextEvent contextEvent) {
      Global.printLog(statefulEjbExample.sayHi());
   }

   @Override
   public void contextDestroyed(ServletContextEvent contextEvent) {
        /* Do shut down stuff. */
   }

}