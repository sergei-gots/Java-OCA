package Lesson20;

import java.util.ArrayList;

class Student {
    String name = "Test";
    int grade = 5;
}

public class Test91 {
    public static void main(String[] args) {
    
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("hello");

        for(String s:list){
            System.out.print(s + " ");
        }        
        System.out.println();

        //ArrayList.TOSTRING-Method
        System.out.println("list.toString:" + list.toString());
        
        ArrayList <Student> listStudents = new ArrayList<>();
        listStudents.add(new Student());
        System.out.println("listStudents.toString:" + listStudents  .toString());
        
    }
}
