package Lesson6;

public class MethodOverloading {

    //void showInt(int i1){
    void show(int i1){
        System.out.println(i1);
        System.out.println("Data Type is \"int\"");
    }
    
    //void showBoolean(boolean b1){
    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data Type is \"boolean\"");
    }
    
    //void showString(String s1){
    void show(String s1){
        System.out.println(s1);
        System.out.println("Data Type is \"String\"");
    }
    
    void show(int a, int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println("Data Type are \"int\"");
    }
    
    void show(String s, int a){
        System.out.println("String:\"" + s + "\", int:" + a + ".");
    }
    
    void show(int a, String s){
        System.out.println("What an amazing day!)");
    }

}


class MethodOveloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        //mO.showInt(a);
        mO.show(a);
        boolean b = true;
        //mO.showBoolean(b);
        mO.show(b);
        String s = "Hi everyone!!!";
        //mO.showString(s);
        mO.show(s);
        int a1 = 700;
        mO.show(a, a1);
        mO.show("Hi", 10);
        mO.show(10, "Hi");
    }
}