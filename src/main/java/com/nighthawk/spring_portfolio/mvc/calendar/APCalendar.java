package com.nighthawk.spring_portfolio.mvc.calendar;

// Prototype Implementation

public class APCalendar {

    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          
    public static boolean isLeapYear(int year) {

          // if the year is divisible by 4
    if (year % 4 == 0) {

        // if the year is century
        if (year % 100 == 0) {
  
          // if year is divisible by 400
          // then it is a leap year
          if (year % 400 == 0) 
            return true;

          else
            return false;
        }

        // if the year is not century
        else
          return true;
      }
      
      else
        return false;

    }
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */
    private static int firstDayOfYear(int year) {

            int leap, common, totaldays, day;

            // Count years between 
            year = (year - 1) - 1899; //1899 - starts on a Sunday

            // Count leap years
            leap = year / 4;

            // Common (non leap) years
            common = year - leap;

            // Total number of days in the years lying between the years
            totaldays = (common * 365) + (leap * 366) + 1;

            // Actual day
            day = (totaldays % 7);

            return day;
        }
    


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    public static int dayOfYear(int month, int day, int year) {
        // implementation not shown
        
        return (int) (Math.random() * (366 - 1)) + 1;
    
        }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    public static int numberOfLeapYears(int year1, int year2) {
         // to be implemented in part (a)

         int leapYears = 0;
        for (int y = year1; y <= year2; y++)
            if (isLeapYear(y))
                leapYears++;
        return leapYears;
        }

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
        // to be implemented in part (b)
        int startDay = firstDayOfYear(year);
        int nthDay = dayOfYear(month, day, year);
        int returnDay = (startDay + nthDay - 1) % 7;
        return returnDay;
    }

        /** Tester method */
        public static void main(String[] args) {
       
            // Private access modifiers
            System.out.println("\n \n firstDayOfYear: " + APCalendar.firstDayOfYear(2022));
    
            System.out.println("\n dayOfYear: " + APCalendar.dayOfYear(1, 1, 2022));
    
            // Public access modifiers
            System.out.println("\n Testing isLeapYear:");
    
            System.out.println("\n isLeapYear 2022: " + APCalendar.isLeapYear(2022));
            System.out.println("\n isLeapYear 2000: " + APCalendar.isLeapYear(2000));
            System.out.println("\n isLeapYear 3000: " + APCalendar.isLeapYear(3000));
    
    
            System.out.println("\n numberOfLeapYears: " + APCalendar.numberOfLeapYears(2000, 2022));
    
            System.out.println("\n dayOfWeek: " + APCalendar.dayOfWeek(1, 1, 2022));
        }
    
}
