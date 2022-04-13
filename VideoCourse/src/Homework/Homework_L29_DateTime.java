 
package Homework;

import java.time.*;
import java.time.format.*;

 
public class Homework_L29_DateTime {
    public static void main(String[] args) {
        
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMMM-YYYY (w) h:mm:ss.n");
        LocalDateTime ldt = LocalDateTime.of(2022, 03, 05, 16, 20, 33, 44444);
        System.out.println("time1:" + dtf1.format(ldt));
        Period p = Period.of(0,1,2);
        ldt = ldt.plus(p);
        System.out.println("tim2: " + dtf1.format(ldt));
        
    }
    
            
}
