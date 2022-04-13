 
package Lesson13;

 
public class Employee {
    public static void main(String[] args) {
        switch("Monday"){
            case "Monday": 
            case "Thuesday": 
            case "Wednesday": 
            case "Thursday": 
            case "Friday": 
                System.out.println("worktime untill 6pm.");
                break;
            case "Saturday": 
                System.out.println("worktime untill 2pm.");
                break;
            case "Sunday": 
                System.out.println("No work.");
                break;
            default: 
                System.out.println("Illegal day. Such a day does not exist.");
                
        }
        
        byte Weekday = 1;
        final int a = 1;
        final int b = 2;
        
        final int c;
        c = 1;
               
        switch(Weekday*3/3){
            case 1: 
            case a*b: 
            //case c:
            //case null:
            //case "Privet":    
            case 2000:    
            case 3/58: 
            case 4*5: 
            case 5: 
                System.out.println("worktime untill 6pm.");
                break;
            case 6: 
                System.out.println("worktime untill 2pm.");
                break;
            case 7: 
                System.out.println("No work.");
                break;
            default: 
                System.out.println("Illegal day. Such a day does not exist.");
                
        }

    }
}
