 
package Lesson15;

 
public class Test7 {
    
    public static void main(String[] args) {
        
        int money = 100;
        do {
            System.out.println("Place your bet, plz;)");
            money-=10;
            System.out.println("You've lost...");
        }
        while(money>0);
        
        System.out.println(money);
    }
    
    
     
}
