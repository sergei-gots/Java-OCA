 package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //!!!= new ArrayList <> ();
        ArrayList <String> list = new ArrayList<>();
        ArrayList <Integer> listInt = new ArrayList<>();
        listInt.add(3);
        System.out.print("listInt: { ");
        for(Integer nInt:listInt){
               System.out.print(nInt + ", ");
        }
        System.out.println("\b\b }.");
        
        //ADD-Method
        list.add("poka");
        list.add("privet");
        list.add("ok");
        
        list.add(1,"hello");
        
        //list.add(5, "ok"); 
            //causes IndexOutOfBoundsException: Index: 5, Size: 4.
        
        //ArrayList can be created only for REFERENCE-DataTypes
        ArrayList <Integer> listInt1 = new ArrayList<>();
        listInt.add(3);
        
        for(String s:list){
            System.out.print(s+ " ");
        }
        
        System.out.println();
        
        //GET-Method
        System.out.println(list.get(3));
        //System.out.println(list.get(4));
            //causes IndexOutOfBoundsException: Index: 4, Size: 4.
        
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }        
        System.out.println();
        
        //SET-Method
        list.set(0, "!!!");
        //REMOVE-Method
        list.remove("privet");
        list.remove(new String("ok"));
            //SIZE-Method
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }        
        System.out.println();
            
            
    }
}
