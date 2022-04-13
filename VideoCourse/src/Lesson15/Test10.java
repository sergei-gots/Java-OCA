 
package Lesson15;

 
public class Test10 {
    
    public static void main(String[] args) {
        
        HOURS:
        for(int hour=0; hour<24; hour++){
            
            int minute=0;
            
            MINUTES:
            while(minute<60){
                System.out.println(hour + ":" + minute);
                minute++;
            }
            
        }
        
       
    }
    
    
     
}
