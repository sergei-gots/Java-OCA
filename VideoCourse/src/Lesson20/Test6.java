package Lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Test6 {
    public static void main(String[] args) {
    
        ArrayList <StringBuilder> list = new ArrayList<>();
        
        //ADD-Method
        StringBuilder sbPoka = new StringBuilder("poka");
        list.add(sbPoka);
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        list.add(sbPoka);
        
        for(StringBuilder sb:list){
            System.out.print(sb + " ");
        }        
        System.out.println();

        //ArrayList.INDEXOF-Method
        System.out.println(list.indexOf(new StringBuilder("poka")));
        System.out.println(list.indexOf(sbPoka));
        
        int nLastIndexOfPoka = list.lastIndexOf(sbPoka);
        System.out.println(nLastIndexOfPoka);
        
        list.get(nLastIndexOfPoka).append(".add");
        System.out.println(list);

        System.out.println(list.contains(sbPoka));
        
        Object o = new Object();
        System.out.println(o);
        
        ArrayList <StringBuilder> listCopied = new ArrayList <> (list);
        ArrayList <StringBuilder> listClone = (ArrayList <StringBuilder>)
                     list.clone();
        list.get(0).setCharAt(0, 'H') ;
        list.set(1, sbPoka);
        System.out.println(list);
        System.out.println(listCopied);
        System.out.println(listClone);
        
        
        //ToArray-Methods
        Object[] array1 = list.toArray();
        show(array1, "array1");
        
        StringBuilder [] array2 = list.toArray(new StringBuilder [10]);
        
        show(array2, "array2");
        
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        
        StringBuilder [] arraySb = {sb2, sb3, sb3, sb3};
        List <StringBuilder> listSb = Arrays.asList(arraySb);
        System.out.println("listSb: " + listSb);
        arraySb[1].append("!!!");
        System.out.println("listSb: " + listSb);
        arraySb[1] = new StringBuilder("***");
        System.out.println("listSb: " + listSb);
        
        
        //Collections.sort(List)-method
        Collections.sort(listSb);
        System.out.println("Sorted listSb: " + listSb);
        
       //Iterator
        Iterator <StringBuilder> it = listSb.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         
    }
    
    static void show(Object[] array, String sName){
        System.out.print(array);
        System.out.print(" \"");
        System.out.print(sName);
        System.out.print("\": [");
        for(Object o1: array){
            System.out.print(o1);
            System.out.print(' ');
        }
        System.out.println("\b].");
    }
}
