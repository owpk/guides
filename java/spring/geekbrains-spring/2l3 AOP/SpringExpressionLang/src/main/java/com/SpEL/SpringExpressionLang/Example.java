package com.SpEL.SpringExpressionLang;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Example {
   public static class User {
      private String name;

      public User(String name) {
         this.name = name;
      }

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }
   }

   public static void main(String[] args) {
      ExpressionParser parser = new SpelExpressionParser();
      Expression exp = parser.parseExpression("'Hello World'");
      String message = (String) exp.getValue();
      System.out.println(message);

      String obj = (String) parser.parseExpression("'Hello World'.concat('!!!')").getValue();
      System.out.println(obj);

      int length = parser.parseExpression("new String('777').length()").getValue(int.class);
      System.out.println(length);

      User u = new User("Jhona");

      Object ob = parser.parseExpression("'name'").getValue(u);
      System.out.println(ob);


      Object ob2 = parser.parseExpression("name == 'John'").
             getValue(u, Boolean.class);
      System.out.println(ob2);

   }
}
