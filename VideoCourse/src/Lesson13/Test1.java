 
package Lesson13;

 
public class Test1 {
    
}

class Student{
    int grade;
    
    Student(int grade){
        this.grade = grade;
    }
    
    public static void main(String[] args) {
        
        Student st1 = new Student(5);
        
        if(st1.grade==2){
            System.out.println("Student is DVOECHNIK.");
        }
        else if(st1.grade==3){
            System.out.println("Student is TROECHNIK.");
        }
        else if(st1.grade==4){
            System.out.println("Student is HOROSHIST.");
        }
        else if(st1.grade==5){
            System.out.println("Student is OTLICHNIK.");
        }
        else {
            System.out.println("Grade is illegal.");
        }
        
        switch(st1.grade){
            case 2: 
                System.out.println("Student is DVOECHNIK.");
                break;
            case 3: 
                System.out.println("Student is TROECHNIK.");
                break;
            case 4:
                System.out.println("Student is HOROSHIST.");
                break;
            case 5:
                System.out.println("Student is OTLICHNIK.");
                break;
            default: 
                System.out.println("Grade is illegal.");
        }
    }
}
