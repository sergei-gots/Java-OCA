package Lesson20;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
    
        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }        
        System.out.println();

        
        //ArrayList.CONTAINS-Method
        StringBuilder sb = new StringBuilder("new");
        list.add(sb);
        System.out.println("list.contains:" + list.contains(new StringBuilder("new")));
        System.out.println("list.contains:" + list.contains(sb));
        
    }
}
