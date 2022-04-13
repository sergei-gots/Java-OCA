 
package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
public class Test11 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList <StringBuilder> list1 = new ArrayList <>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        

        //Object[] toArray() - METHOD
        Object [] array1 = list1.toArray();
        for(Object o:array1){
            System.out.print(o+ " ");
        }
        System.out.println();
        

        //DatatType[] toArray(DataType[] array) - METHOD
        StringBuilder [] array2 = list1.toArray(new StringBuilder [5]);
        list1.add(sb3);
        for(StringBuilder sb:array2){
                System.out.print(sb+ " ");
        }
        System.out.println();
        
        //List<DataType>Arrays.asList(DatatType[])-METHOD
        StringBuilder [] array = {sb2, sb3, sb3, sb3};
        List <StringBuilder> list8 = Arrays.asList(array);
        System.out.println("List 8: " +  list8);
        
        array[0].append("!!!");
        System.out.println("List 8: " +  list8);
        
        array[0] = new StringBuilder("!!!!");        
        System.out.println("List 8: " +  list8);
    }
}
