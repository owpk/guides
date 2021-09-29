package example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reader {
   public static void main(String[] args) {
      Logger log = LogManager.getLogger(Writer.class);
      try {
         throw new RuntimeException("OOPS!!");
      } catch (RuntimeException e) {
         log.log(Level.ERROR, e);
      }
   }
}
