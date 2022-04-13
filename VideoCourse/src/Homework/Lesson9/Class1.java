 
package Homework.Lesson9;

 
public class Class1 {
    
    public static void createLocalInstances(){
        Class1 c1Instance1 = new Class1();
        Class1 c1Instance2 = new Class1();
    }
    
    public static void main(String[] args) {
        String st="Privet!";
        Class1 c1_1 = new Class1();
        Class1 c1_2 = new Class1();
        Class1 c1_3 = new Class1();
        createLocalInstances();
        
        
        st = null;
        c1_1 = null;
        
    }
}
