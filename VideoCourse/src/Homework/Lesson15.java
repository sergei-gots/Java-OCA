 
package Homework;

 
public class Lesson15 {
    
    static void time(){
                
        int hour = 0;
        
        HOURS:
        while(hour<6){
        
            int minute=0;
        
            MINUTES: 
            
            do{
                //if(hour>1 && minute!=0 && minute%10==0) {
                if(hour>1 && minute%10==0) {
                        break HOURS;
                    }
                
                int second=0;
                
                SECONDS: 
                while(second<=59) {
                    
                    if(second*hour>minute){
                        break SECONDS;
                    }
                    
                    if(hour<10){ System.out.print("0"); }
                    System.out.print(hour + ":");
                    if(minute<10){ System.out.print("0"); }
                    System.out.print(minute + ":");
                    if(second<10){ System.out.print("0"); }
                    System.out.println(second);
                    second++;
                }
                minute++;
            }
            while(minute<60);
            hour++;
        }
    }
    
    public static void main(String[] args) {
        time();
    }
    
}
