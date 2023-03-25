package edu.brandeis.cosi12b2.lec18;

import java.util.*;

public class CalendarDateTest {

    public static void main(String[] args) {
        ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>(); dates.add(new CalendarDate(2, 22));
        dates.add(new CalendarDate(10, 30));
        dates.add(new CalendarDate(4, 13));
        dates.add(new CalendarDate(3, 16));
        dates.add(new CalendarDate(4, 28));
        System.out.println("birthdays before sorting = " + dates);
        Collections.sort(dates);
        System.out.println("birthdays after sorting = " + dates);
    }

}
