package edu.brandeis.cosi12b2.lec18;

// The CalendarDate class stores information about a single calendar date (month and day but no year).
public class CalendarDate implements Comparable<CalendarDate> {
    private int month;
    private int day;

    public CalendarDate(int month, int day) {
        this.month = month;
        this.day = day;
    }

//    public int compareTo(CalendarDate other) {
//        if (this.month != other.month) {
//            return this.month - other.month;
//        } else {
//            return this.day - other.day;
//        }
//    }

//    public int compareTo(CalendarDate other) {
//    	return 0;
//    }
    
    public int compareTo(CalendarDate rhs) {
        if (rhs.month != this.month) {
            return rhs.month - this.month;
        } else {
            return rhs.day - this.day;
        }
    }

    public String toString() {
        return String.format("%02d/%02d", month, day);
    }
}