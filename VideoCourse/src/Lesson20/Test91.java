package Lesson20;

import java.util.ArrayList;

class Student20 {
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
        
        ArrayList <Student20> listStudent20s = new ArrayList<>();
        listStudent20s.add(new Student20());
        System.out.println("listStudent20s.toString:" + listStudent20s  .toString());
        
    }
}
