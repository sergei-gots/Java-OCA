 
package Lesson26;


public class Test7 {
    public static void main(String[] args) {
        Lion l = new Lion();
        Lion l2 = new Lion();
    }
}

class Animal{
    Animal(){System.out.println("Constructor of Animal");}
    static{System.out.println("Static Init of Animal");}
    {System.out.println("Non-static Init of Animal");}
}

class Mammal extends Animal{
    Mammal(){System.out.println("Constructor of Mammal");}
    static{System.out.println("Static Init of Mammal");}
    {System.out.println("Non-static Init of Mammal");}
}
class Lion extends Mammal{
    Lion(){System.out.println("Constructor of Lion");}
    static{System.out.println("Static Init of Lion");}
    {System.out.println("Non-static Init of Lion");}
}


