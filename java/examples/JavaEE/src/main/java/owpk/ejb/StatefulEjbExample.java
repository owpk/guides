package owpk.ejb;

import javax.ejb.Stateful;

@Stateful
public class StatefulEjbExample {

    public String sayHi() {
        return "Hi, I,m Stateful EJB";
    }
}