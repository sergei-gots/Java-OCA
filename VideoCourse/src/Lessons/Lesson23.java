 
package Lessons;
/* OVERRIDING
 * HIDING
 * FINAL
 * STATIC
 *
 * INHERITANCE AND POLYMORPHISM
 *
 * POLYMORPHISM - ability of an object to take on different forms.
*               it's an ability of an methods to take on different things
*               dependent on DT-of an Object calling this method.
*/
 
public class Lesson23 {
   public Object abc(int n) {
       switch(n){
           case 0: return null;
           case 1: return "hello";
           case 2: return new int [] {2,4,7,0};
           case 3: return new Doctor();
           default: return new Employee();
       }
   }
   
   
   public Doctor getDoctor(int n) {
       switch(n){
           case 0: return null;
           case 1: new Doctor();
           case 2: new Surgeon();
           default: return new Doctor();
       }
   }
    
    public static void main(String[] args) {
        
        //testEmployee();
        //testMethodOverriding();
        //TestPolymorphism.test();
        TestKeywordSuper.test();
    }
    
    
    //THESE ARA OVERLOADED METHODS! (not overrided):
    void abc(Lessons.Animal a)  { System.out.println("a");}
    void abc(Lessons.Mouse m)   { System.out.println("m");}

/* BINDING - identifying of a called method
     * based on an object making the call or  
     * on a DT of #Ref-var
     *
     *  COMPILE TIME BINDING (static binding, early binding):
     *  - privat methods
     *  - static methods
     *  - final methods 
     *              - because all of them are UNOVERRIDABLE
     *
     *  RUN TIME BINDING (dynamic binding, late binding):
     *  - all other methods
     *
     */
    
    static void testEmployee() {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();
        
        /* Ref-var of Employee-DataType could refer to object of
         * any subclass but not vice-versa
         */
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Doctor  d2 = new Surgeon();
        Employee emp4 = new Surgeon();
        //Driver dr2 = new Employee(); /* incompatible types */
        
        Employee emp1 = new Doctor(); 
        System.out.println("Employee:");
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        emp1.eat();
        emp1.sleep();
        //emp1.lechit(); /* Dytetype Employee doesn't have the lechit-method
        
        Doctor d3 = new Surgeon();
        System.out.println(d3.age);
        d3.eat();
        d3.lechit();  /* Datatype Doctor has such a method - lechit. */
        /*d3.operation();*//* Though d3 has been assigned to Surgeon, actually
                            d3 is of Doctor-Datatype */
        
                            
    }    
    
/*
 *   METHOD OVERRIDING
 *
 *  It's a change of a NON-STATIC, NON-FINAL, NON-PRIVATE method of one
 *  of a parent classes in a subclass. 
 *   (in case the method is static there won't be overriding,
 *      a call will staticaly bound on COMPILE-TIME.
 *      That's called METHOD HIDING. The Method will hide with
 *  a method within a subclas.
 *  
 *  A METHOD IS OVERRIDED IF:
 * 
 *      1) The name of the method in the subclass 
 *           is the same as in the parent class.   
 *      2) The arg-list is the same to the one in the parent class.       
 *      3) Return type is the same to the one in the P.C.
 *      !OR it can be a type of a subclass of the class
 *      which was declared as a returned type in the overrided method.
        And such as variation in return types within overriding and
 *      overrided methods calls COVARITANT-RETURN-TUPES.    
 *      4) Overriding method must be NON-STATIC (like the overrided one)   *      
 *      NB 
 *      Access Modifier of an overriding method can be the same
 *      or less strict than the AM an overrided method. 
 *             
 * METHOD HIDING
 *          - for STATIC methods from a Parent Class
 *          - the same set of args
 *          - the same return type (must be)
 *          - access modifier in subclass must be less strict
 *          - both methods will be static
    
  NON-PRIVATE VARIABLES HIDING
    
    PRIVATE METH./VAR CAN'T BE HIDDEN NOR OVVERRIDE
        - they aren't inherited/
    
    FINAL METHODS aren't hideable NEITHER overridable
 */
    static void testMethodOverriding(){
        
        Employee e;
        
        if(false) {
            e = new Employee();
            Teacher t = new Teacher();
            e.eat();
            t.eat();
        }
        
        if(false){ 
            e = new Teacher();
            e.eat();
        }
        
        if(false){ 
            Lesson23 test = new Lesson23();
            Lessons.Animal an = new Lessons.Mouse();
            test.abc(an); /* Output is "a": an is of the Animal-DT.
                            ant abc(Animal) will be called.
                            COMPILE-TIME-Binding
                           */
            an.getName(); /* Mouse.getName will be called:
                             an refers to a Mouse object.
                             RUN-TIME-Binding.
                          */
        }
        
        if(false){
            Employee emp = new Employee();
            Teacher t = new Teacher();
            emp.sleep();
            t.sleep() ;
        }
        
        if(true){
            Mouse1 m1 = new Mouse1();
            m1.showInfoAboutAnimal();
            m1.showInfoAboutMouse();
        }
        
    
    }
    
}


class Test1 {
    String abc(){
        return null;
    }
    
    int abc2(){
        char c = 'h';
        return c;
    }
}

class H extends Teacher{}
    
    class Animal{
        void getName(){
            System.out.println("Animal");
        }
    }

class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}

class Food{}
class Fruits extends Food{}

class Employee extends java.lang.Object{
    //HIDED (in the class Teacher) VAR:
    double salary = 100;
    
    String name = "Kolya";
    int age;
    int experience;
    
    //the next field is seen only from a variable of Employee-DT
    private final int a = 5;
    
    Food eat(){
        System.out.println("Employee eats");
        return new Food();
    }
   
    void sleep(){
        System.out.println("spit");
    }
}

class Doctor extends Employee{
    void lechit(){
        System.out.println("lechit");
    }
}

class Surgeon extends Doctor {
    void operation(){
    }
}

class Teacher extends Employee{
    int studentsCount;
    //HIDING VAR:
    String salary = "150";
    
    Fruits eat() {
        System.out.println("Teacher eats.");
        return new Fruits();
    }
    //Key-word OVERRIDE to check and annotate
    //if the method overrides it's parent class method.
    @Override
    public void sleep() {
        System.out.println("Teacher sleeps.");
    }

    void teach(){ 
        System.out.println("uchit");
    }
}

class Driver extends Employee{
    String carBrand;
    void drive(){
        System.out.println("vodit");
    }
}

/* FINAL CLASS is a class that CAN'T HAVE ANY SUBCLASSES 
 * +: PERFORMANCE - all the BINDING is executed on COMPILE TIME
 * Example of FINAL CLASS is Stiring-Class
 * Constructors can't be final.
 */
final class X {
}

//class Y extends X{} /* That's IMPOSSIBLE

//class S extends String{}

class Animal1{
//    static
         String showName(){
        return "SomeAnimal";
    }
    
    void showInfoAboutAnimal(){
        System.out.println("Name of the animal: " + showName());
    }
}

class Mouse1 extends Animal1{
//    static 
        String showName(){
        return "Jerry";
    }
    
    void showInfoAboutMouse(){
        System.out.println("Name of the mousel: " + showName());
    }
    
}

/** POLYMORPHISM **/

class A{
    void abc(A a){
        System.out.println("A");
    }
}

class B extends A{
    void abc(B b1){
        System.out.println("B");
    }
}

class C extends B{

    //OVERRIDES A.abc()
    void abc(A a2){
        System.out.println("BBB");
    }

    //OVERLOADs A.abc()
    void abc(B b2){
        System.out.println("C");
    }
}

class TestPolymorphism{
    //OVERRIDEs B.abc();
    static void test(){
        A c1 = new C();
        //The A.abc() will called!!
        c1.abc(new B());
    }

}

/*  Keyword SUPER 
 *  
 * is used if a field is hidden.
 */
class A10 {
    
    A10(){
        System.out.println("A10()-constructor");
    }
    
    A10(boolean b){
        System.out.println("A10(boolean b)-constructor");
    }
    
    String s1 = "privet";
    static double d1 = 3.14;
    int summ(int ...i){
        int result = 0;
        for (int a:i){
            result += a;
        }
        return result;
    }
    
    static void abc(){
        System.out.println("static method");
    }
}

class B10 extends A10{
    //String s2 = /*super.*/s1 + ", drug!";
    //String s1 = super.s1 + ", drug!";
    double d1 = super.d1;
    boolean s1 = true;
    
    B10(){
        super(false);
    }
    
    int summ(int ... i){
        int result = super.summ(i);
        System.out.println("Summ: " + result);
        super.abc();   //also static method 
                       //of a superclass can be called
        return result;
    }
}

class TestKeywordSuper {
    static void test(){
        B10 b = new B10();
        System.out.println(b.s1);
        //System.out.println(super.s1); /* super refers to AN OBJECT */
        
    }
}