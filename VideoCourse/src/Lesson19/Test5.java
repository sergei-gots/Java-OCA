 
package Lesson19;

 
public class Test5 {
    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"MathAnalysis", "Philosophy"};
        
        for(String s : students) {
            System.out.print("Student " + s + " takes exams:\t");
            for(String e : exams){
                System.out.print(e + ' ');
            }
            System.out.println();
        }
        System.out.println();
    }
}
