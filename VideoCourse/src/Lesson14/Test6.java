 
package Lesson14;

 
public class Test6 {
    
    public static void time(){
        //Outer for
        OUTER: for(int hour=0; hour<=23; hour++){
            System.out.println("BEGIN of an OUTER LOOP"); 
            //Inner for
            INNER: for(int minute=0; minute<=59; minute++){
                if(minute==20){ continue OUTER;}
                System.out.println(hour + ":" + minute);
                if(minute==30){break OUTER;}
            }
            System.out.println("INNNER LOOP has ENDED"); 
        }
    }
    
    public static void main(String[] args) {
        time();
    }
}
