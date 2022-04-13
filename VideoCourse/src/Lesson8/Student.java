 
package Lesson8;

 
public class Student {
    
    String name;
    int course;
    static int count;
    
    int a;
    
    public Student(String name_, int course_){
        count++;
        name = name_;
        course = course_;
        System.out.println("Student#" + count
               + " has been successfully created.");
    }

    public static void showCount(){
        System.out.println("There are " + count + " students have been created");
    } 
            
/*    public static void main(String[] args) {
        System.out.println(Student.count);
        
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 5);
        Student st3 = new Student("Masha", 3);
        
        System.out.println(st1.name);
        System.out.println();
        
        //Good idea:
        System.out.println(count);
        System.out.println(Student.count);
        //Not a good idea:
        System.out.println(st1.count);
        System.out.println(st2.count);
        System.out.println(st3.count);
        
        Student.showCount();
        st1.showCount();  
    }
*/

    public static void main(String[] args) {
        abcd();
        Student st3 = new Student("Ivan", 1);
        st3.abc();
    }
    
    void abc(){
        count++;
        a++;
        
    }
    
    static void abcd(){
        Student.count++;
        //But it is not possible to use instance variable without created
        //instance
        //a++;
        Student st2 = new Student("Petr",1);
        st2.a++;
    }
}