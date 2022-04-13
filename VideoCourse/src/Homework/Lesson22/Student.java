 
package Homework.Lesson22;

 
public class Student {
    private StringBuilder name;
    private int grade;
    private int course;
    
    public Student(){
    }
    
    public Student(String name, int course, int grade){
        setName(name);
        setGrade(grade);
        setCourse(course);
    }
    
    public boolean setName(String name){
        if (name.length()<3) {
            System.out.println("The name \"" + name
                + "\" is too short. It should be containing not less than 3 symbols.");
            return false;
        }
        
        this.name = new StringBuilder(name);
        return true;
    }
    
    public boolean setGrade(int grade){
        if (grade<1 || grade>10) {
               System.out.println("The grade \"" + grade
                + "\" is  incorrect. Should be within interval from 1 to 10.");
            return false;
        }
        this.grade = grade;
        return true;
    }
    
    public boolean setCourse(int course){
        if (course<1 || course>4) {
               System.out.println("The course \"" + course
                + "\" is  incorrect. Should be within interval from 1 to 4.");
            return false;
        }
        this.course = course;
        return true;
    }
    
    
    public StringBuilder getName(){
        return new StringBuilder(name);
    }
    
    public int getGrade(){
        return grade;
    }
    
    public int getCourse(){
        return course;
    }
    
    public void showInfo(){
        System.out.println("Student " + name 
            + ". course: " + course
            + ", av.grade: " + grade
            + ".");
    }
    
    
    
    
}

class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.showInfo();

        Student student2 = new Student();
        student2.setName("Jo");
        
        StringBuilder sbName = new StringBuilder("Johnson");
        
        student2.setName(sbName.toString());
        student2.showInfo();
        
        Student student3 = new Student("Smith", 1, 11);
        student3.showInfo();
        student3.setCourse(-3);
        student3.setGrade(10);
        student3.showInfo();
        
        student3.setName("Gots");
        student3.setCourse(4);
        
        System.out.println("Student3.name: " + student3.getName());
        System.out.println("Student3.course: " + student3.getCourse());
        System.out.println("Student3.grade: " + student3.getGrade());
        student3.showInfo();
        
        sbName = student3.getName();
        sbName.append(" Sergei");
        System.out.println("Modified name in returned object: " + sbName);
        System.out.println("Name within the student3 object: " + student3.getName());
    }
}
