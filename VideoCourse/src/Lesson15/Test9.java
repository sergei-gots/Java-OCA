 
package Lesson15;

 
public class Test9 {
    
    public static void main(String[] args) {
        
        //int hour = 0;
        int hour = -1;
        
        HOURS: 
        do {
            hour++;   //it's an update statement. It's here, before other actions.
            int minute = 0;
            
            MINUTES:
            while(minute<60){
                if(minute==20) {
                    //continue HOURS; //!!!It's w/o execution "hour++;"-statement below.
                    break HOURS;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }
            
            //it's an update statement. It's here, after other actions.
            //hour++;
        }
        while(hour<24);
    }
    
    
     
}
