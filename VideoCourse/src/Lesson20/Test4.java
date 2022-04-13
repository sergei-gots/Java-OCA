package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
    
        ArrayList <String> list = new ArrayList<>();
        
        //ADD-Method
        list.add("poka");
        list.add("privet");
        list.add("ok");
        
        list.add(1,"hello");
        
        
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }        
        System.out.println();
    
        //addAll(ArrayList alist)-Method
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        //COPIES All the Strings from list2 to list
        //list.addAll(list2);
        list.addAll(1, list2);
        list2.set(1, "Ivanov");
        
        System.out.print("list: ");
        for(String s:list){
            System.out.print(s + " ");
        }
        System.out.println();
        
        System.out.print("list2: ");
        for(String s:list2){
            System.out.print(s + " ");
        }
        System.out.println();
        
    }
}
