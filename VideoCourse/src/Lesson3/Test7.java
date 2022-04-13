package Lesson3;

public class Test7 {

    public static void main(String[] args) {
    
        int a =10;
        int b = 5;
        
        int c = 99;
        int d = 100;
        
        boolean e = a>b & ++c==d;
        
        int x = 10;
        int y = 5;
        
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = true;
        boolean b4 = true;

        System.out.println(a&b);
        System.out.println(a|b);
        
        System.out.println(b1^b2^b3^b4);
        System.out.println(!b1^b2^!b3^!b4);
    }
    
}
