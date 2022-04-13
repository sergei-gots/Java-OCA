 
package Lesson25;
 
public class TestInterfaces implements Interface1, Interface2{
    public void abc(){ System.out.println("OK");}
    public static void main(String[] args) {
        TestInterfaces test= new TestInterfaces();
        System.out.println("((Interface2)t).a="+ ((Interface2)test).a);
        //System.out.println("a="+ test.a); //not allowed: both variables a
                                             //in Interface1/2 match
                            
        ((Interface2)test).abc();
        test.abc(); //it IS implemented IN THE CLASS => allowed
    }
}

interface Interface1{
    int a =5;
    void abc();
}

interface Interface2{
    int a =10;
    void abc();
}