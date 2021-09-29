package org.example;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class SomeClass {

    public static Days daysToNewYear(LocalDate fromDate) {
        LocalDate newYear = fromDate.plusYears(1).withDayOfYear(1);
        return Days.daysBetween(fromDate, newYear);
    }

    public static void main(String[] args) {
        Days d = daysToNewYear(LocalDate.now());
        System.out.println(d.getDays());
    }
}
