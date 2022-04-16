 
package Lesson25;

//Overrided methods are polymorphic too

public class Polymorphism {
    public static void main(String[] args) {
        DriverPM [] array1 = {new DriverPM(), new DriverPM()};
        EmployeePM [] array2 = {new TeacherPM(), new DoctorPM()};
        Help_ablePM [] array3 = {new DriverPM(), new DoctorPM()};
        
        
        
        EmployeePM emp1 = new TeacherPM();
        EmployeePM emp2 = new DriverPM();
        EmployeePM emp3 = new DoctorPM();
        
        EmployeePM [] array = { emp1, emp2, emp3 };
        for(EmployeePM emp:array2){
            emp.work();
        }
        System.out.println();
        
        Help_ablePM h = new TeacherPM();
        h.help();
        emp2.help();
        emp1.work();
        emp2.work();
        emp3.work();
        
        System.out.println();
        System.out.println("emp1 instanceof TeacherPM = " + (emp1 instanceof TeacherPM));
        System.out.println("emp1 instanceof Help_ablePM = " + (emp1 instanceof Help_ablePM));
        System.out.println("emp1 instanceof EmployeePM = " + (emp1 instanceof EmployeePM));
        System.out.println("emp1 instanceof DriverPM = " + (emp1 instanceof DriverPM));
        
        String s1 = null;
        System.out.println("s1 instanceof String = " + (s1 instanceof String));
        System.out.println("array1 instanceof Object = " + (array1 instanceof Object));
        
        
    }
}

abstract class EmployeePM implements Help_ablePM{
    void sleep(){System.out.println("The employee is sleeping.");}
    public void help(){System.out.println("The EmployeePM is helping.");}
    abstract void work();
}

class TeacherPM extends EmployeePM implements Help_ablePM{
    void work(){
        System.out.println("The teacher is working.");
    }
    public void help(){System.out.println("The teacher is helping.");}
}

class DriverPM extends EmployeePM{
    void work(){
        System.out.println("The driver is working.");
    }
}

class DoctorPM extends EmployeePM{
    void work(){
        System.out.println("The doctor is working.");
    }
}


interface Help_ablePM{
    void help();
}