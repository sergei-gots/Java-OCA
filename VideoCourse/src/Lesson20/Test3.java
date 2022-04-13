package Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        //ADD-Method
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        
        
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }        
        System.out.println();
        
        for(int i=0; i<list.size(); i++){
            if(i==list.size()-1) {
                list.set(i, new StringBuilder("Set"));
            }
            list.get(i).append("!!!");
        }   
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }
        System.out.println();
            
        //REMOVE-Method
        list.remove(2);
        //list.remove(3);
            //Causes IndexOfBoundsException: Index:3 Size:3
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }
        System.out.println();    
            
        System.out.println(list.remove(new StringBuilder("hello!!!")));
            //prints FALSE: 
            //in STRINGBUILDER Classs EQUALS-Method is NOT OVERLOADED
            
        System.out.println(list.remove("hello!!!"));   
            
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }
        System.out.println();
  
        //list.set(0, new StringBuilder("hello!!!"));
        System.out.println(list.remove(sb1));
            //prints TRUE
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }
        System.out.println();    
            
        list.remove("poka!!!");
        
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }
        System.out.println();
        
        
    }
}
