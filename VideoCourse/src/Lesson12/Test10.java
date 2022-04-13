 
package Lesson12;

 
public class Test10 {
   
    void maximum(int i1, int i2, int i3){
        if(i1>i2 && i1>i3){
            int a = 5;
            System.out.println("Maximum is " + i1);
        }
        else if (i2>i1 && i2>i3){
            System.out.println("Maximum is " + i2);
        }
        else {
            System.out.println("Maximum is " + i3);
        }
    }
    
    void abc(){
        String str;
        int a = 5;
        if(a>=10){
            str="Hello";
        }
        else {
            str=null;
        }
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        
        Test10 t = new Test10();
        t.maximum(4, 7, 0);
        t.abc();
        
        int a1 = 10;
        int b1 = 20;
        int max = (a1>b1)?a1:b1;
        System.out.println(max);
        
        int salary = 500;
        boolean b = true;
        
        if (salary<200) {
            System.out.println("Salary is extremely low.");
        } else if(salary<400 && b==true){
            System.out.println("Salary is a medial.");
        } else if(salary<500){
            System.out.println("Salary is high.");
        } else {
            System.out.println("Salary is perferct.");
        }
    }
 
}
