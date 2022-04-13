package Lesson20;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
    
        ArrayList <String> list = new ArrayList<>();
        
        //ADD-Method
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("hello"));
        
        for(String s:list){
            System.out.print(s + " ");
        }        
        System.out.println();

        //ArrayList.INDEXOF-Method
        System.out.println("list.indexOf:" + list.indexOf(new String("poka")));
        
        //ArrayList.LASTINDEXOF-Method
        System.out.println("list.lastIndexOf:" + list.lastIndexOf(new String("poka")));
        
        System.out.println("list.lastIndexOf:" + list.lastIndexOf(new String("poka!!!")));
        
        //ArrayList.SIZE-Method
        System.out.println("list.size:" +  list.size());
        
        //ArrayList.ISEMPTY-Method
        System.out.println("list.isEmpty:" + list.isEmpty());
        
        list.clear();
        System.out.println("list.clear");
        System.out.println("list.size:" +  list.size());
        System.out.println("list.isEmpty:" + list.isEmpty());
        
        
        
        
    }
}
