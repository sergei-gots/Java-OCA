
package Lesson28_DateTime;


import java.time.*;
import java.time.format.*;

public class Lesson28_Homework{
    static DateTimeFormatter dtFormat1, dtFormat2;
    
    static {
        dtFormat1 = DateTimeFormatter.ofPattern("YYYY, MMMM-DD !! HH:mm");
        dtFormat2 = DateTimeFormatter.ofPattern("HH:mm, DD/MMM/YY");
    }
    
    public static void main(String []args){
        Lesson28_Homework homework = new Lesson28_Homework();
        homework.shift(LocalDateTime.of(2022, Month.JANUARY, 4, 9, 0), 
                       LocalDateTime.of(2022, Month.FEBRUARY, 28, 16, 30), 
                       Period.of(0, 0, 1), 
                       Duration.ofHours(16));
    }
    
    
    void shift(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration dur){
        
        while ((ldt1.compareTo(ldt2)<0)) {
            System.out.print("Work from: ");
            System.out.print(ldt1.format(dtFormat1));
            ldt1 = ldt1.plus(p);
            System.out.print(" to ");
            System.out.print(ldt1.format(dtFormat1));
            System.out.print(";\n\t rest from: ");
            System.out.print(ldt1.format(dtFormat2));
            ldt1 = ldt1.plus(dur);
            System.out.print(" to ");
            System.out.print(ldt1.format(dtFormat2));
            
            System.out.println("");
        }
    
    }
}


