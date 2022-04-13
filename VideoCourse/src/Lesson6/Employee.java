 package Lesson6;

public class Employee {
    
    //A constructor for actual employees.
    public Employee(int id2, String surname2, int age2){
        //Construcor CANNOT call another overloaded constructor directly
        //Employee(surname_,age_);
        //but:
        //this(surname2, age2);
        //id = id2;
        //surname = surname2;
        //age = age2;
        
        this(id2, surname2, age2, 0.0, null);
    }
    
    //A constructor for candidats or trainees.
    public   Employee(String surname3, int age3){
        //surname = surname3;
        //age = age3;
        this(0, surname3, 0, 0.0, null);
    }
    
    //A detailed constructor for actual employees.
    Employee(int id4, String surname4, int age4, 
            double salary4, String department4){
        //"this" can't be only as a FIRST statement IN the constructor BODY
        //this(id4, surname4, age4);
        id = id4;
        surname = surname4;
        age = age4;
        
        salary = salary4;
        department = department4;
            
    }
    
    int id;
    String surname;
    int age;
    double salary;
    String department;  
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Gots", 45);
        System.out.println(emp1.surname);
        
        Employee emp2 = new Employee("TestEmployee", 14);
        System.out.println(emp2.department);
        
        Employee emp3 = new Employee(2, "Snitko", 44, 1100.50, "HR");
        System.out.println(emp3.department);

    }
}
