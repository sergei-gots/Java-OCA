package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
    
        ArrayList <StringBuilder> list = new ArrayList<>();
        
        //ADD-Method
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        
        list.add(1,new StringBuilder("hello"));
        
        
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }        
        System.out.println();
    
        //addAll(ArrayList alist)-Method
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        //COPYES ALL THE REFS to StingBuilder-instances from list2 to list1
        list.addAll(list2);
        
        //Attention!:
        list2.get(1).append("!");
        //But it actually affects and list-items's value
        for(StringBuilder s:list){
            System.out.print(s + " ");
        }
        System.out.println();
        
        //ArrayList.CLEAR()-Method
        list.clear();
        System.out.print("After list.clear(). list is: { ");
        for(StringBuilder s:list){
            System.out.print(s + " ");
        }
        System.out.println("}.");
        
    }
}
