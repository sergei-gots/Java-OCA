 
package Homework;

 
public class Lesson14 {
    
    static void time(){
        
        HOURS: 
        for(int hour=0; hour<=23; hour++){
        
            MINUTES: 
            for(int minute=0; minute<=59; minute++){
                
                if(hour>1 && minute!=0 && minute%10==0) {
                        break HOURS;
                    }
                
                SECONDS: 
                for(int second=0; second<=59; second++) {
                    if(second*hour>minute){
                        break SECONDS;
                    }
                    if(hour<10){ System.out.print("0"); }
                    System.out.print(hour + ":");
                    if(minute<10){ System.out.print("0"); }
                    System.out.print(minute + ":");
                    if(second<10){ System.out.print("0"); }
                    System.out.println(second);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        time();
    }
    
}
