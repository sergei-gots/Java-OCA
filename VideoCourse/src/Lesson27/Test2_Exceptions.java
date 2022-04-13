 
package Lesson27;

 
public class Test2_Exceptions {
    public static void main(String[] args) {
        int array[] = {1,4,0};
        
        //Next throws ArrayIndexOfBoundException: 5
        System.out.println("array[5] = " + array[5]);
        System.out.println("hello");
        
        String s = null;
        //Next throws NullPointerException
        System.out.println("s.length() = " + s.length());
        
    }
}
