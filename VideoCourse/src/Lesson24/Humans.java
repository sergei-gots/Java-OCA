
package Lesson24;

public class Humans {
    Jumpable j1 = new Human();  
    Jumpable j2 = new Animal();
}


class Human implements Jumpable{
    public void jump(){
        System.out.println("The human jumps");
    }
}

class Animal implements Jumpable {
    public void jump(){
        System.out.println("The animal jumps");
    }
}

interface Jumpable{ //Connectin  Humans and Animal interface
    void jump();
}

interface A2{ void abc();}
interface B2 extends A2, Jumpable { void def();}

abstract class D implements /*A2,*/ B2 {} //Becase B2 already extends A2
