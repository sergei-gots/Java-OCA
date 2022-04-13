 
package Homework;

 
public class Lesson13 {
    
}


class Month{

    static void printDaysInMonthYear2015(int nMonthNumber){
        
        switch(nMonthNumber){
            case 2: 
                System.out.println(
                    "There are 28 days in the 2nd Month of the year 2015)");
                break;
            case 4:
            case 6:
            case 9:
            case 11: 
                System.out.println(
                    "There are 30 days in the "
                    + nMonthNumber + ". Month of the year 2015)");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(
                    "There are 31 days in the "
                    + nMonthNumber + ". Month of the year 2015)");
                break;
            default: 
                System.out.println("The month number is not correct.");        
        }
    }
    
    public static void main(String[] args) {
        printDaysInMonthYear2015(1);
        printDaysInMonthYear2015(2);
        printDaysInMonthYear2015(3);
        printDaysInMonthYear2015(4);
        printDaysInMonthYear2015(5);
        printDaysInMonthYear2015(6);
        printDaysInMonthYear2015(7);
        printDaysInMonthYear2015(8);
        printDaysInMonthYear2015(9);
        printDaysInMonthYear2015(10);
        printDaysInMonthYear2015(11);
        printDaysInMonthYear2015(12);
        printDaysInMonthYear2015(0);
        printDaysInMonthYear2015(13);
        
        
    }
}