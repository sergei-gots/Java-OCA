 
package Homework;

public class Homework_Lesson28 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        try {
            tiger.eat("meat");
          // tiger.eat("grass");
          //  tiger.drink("water");
            tiger.drink("beer");
            try {
                tiger.drink("milk");
            } 
            catch (NotWaterException e) {
                System.out.println("e = " + e);
            } 
            finally {
                System.out.println("This is \"finnaly\"-section of the inner \"try\"");
                System.out.println("Everything is going to be ok");
            }
        } 
        catch (RuntimeException e) {
            System.out.println("External try-catch. A RuntimeException is caught.\n e = " 
                               + e);
        }
        catch (Exception e) {
            System.out.println("External try-catch. An Exception is caught.\n e = " 
                               + e);
        }
       
    }
}

class NotWaterException extends Exception {
    NotWaterException(String s){
        super(s);
    }
}
        
class NotMeatException extends RuntimeException {
    NotMeatException(String s){
        super(s);
    }
}



class Tiger {
    void eat(String meal) throws NotMeatException {
        if(meal.equals("meat") == false) {
            throw new NotMeatException("Tiger doesn't eat " + meal);
        } 
        else {
            System.out.println("Tiger is eating meat");
        }
    }
    
    void drink(String beverage) throws NotWaterException {
        if(beverage.equals("water") == false) {
            throw new NotWaterException("Tiger doesn't drink " + beverage);
        } 
        else {
            System.out.println("Tiger is drinking water");
        }
    }

}