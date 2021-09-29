package example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.IOException;
import java.util.Properties;

public class Writer {
   public static void main(String[] args) {
      String file = System.getProperty("user.home");
      System.out.println(file);
      Logger logger = LogManager.getRootLogger();
      Configurator.setAllLevels(logger.getName(), Level.ALL);

      Logger log = LogManager.getLogger(Writer.class);
      try {
         throw new RuntimeException("OOPS!!");
      } catch (RuntimeException e) {
         log.log(Level.INFO, "MSG");
         log.log(Level.ERROR, "MSG");
      }
   }
}
