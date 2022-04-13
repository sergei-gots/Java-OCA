 
package Lesson27;

 
public class Test1_Lesson26 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println("a.an = " + an.a);
        System.out.println("b.an = " + an.b);
        an.abc();
        an.def();
    }
}

class Animal{
int a =5;
static int b = 10;
void abc(){System.out.println("non-static method of Animal");}
static void def(){System.out.println("static method of Animal");}
}

class Tiger extends Animal{

int a =15;
static int b = 20;
void abc(){System.out.println("non-static method of Tiger");}
static void def(){System.out.println("static method of Tiger");}
}
