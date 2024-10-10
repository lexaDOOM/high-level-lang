package edu.penzgtu;

public class DaysInMonth {
    private int year;
    private int month;

    // Constructor with parameters
    public DaysInMonth(int month, int year) {
        this.month = month;
        this.year = year;
    }

    // Leap year check method 
    public boolean isLeapYear() {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method that returns the number of days
    public int getNumberOfdays() {
        switch(month) {

            // 31 days months
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            // 30 days months
            case 4: case 6: case 9: case 11:
                return 30;
            
            // February
            case 2:
                return isLeapYear() ? 29 : 28;
            
            // Incorrect month number
            default:
                return 0;
        }
    }
}
