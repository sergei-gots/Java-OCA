 
package Lesson20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import java.util.Map;
import java.util.HashMap;

public class Test20_3_1 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new  ArrayList <> ();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        al1.add("three");
        System.out.println("al1: " + al1);
        
        ArrayList <String> al2 = new  ArrayList <> ();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");
        System.out.println("al2: " + al2);
        
        ArrayList <String> al3 = new  ArrayList <> ();
        al3.add("one");
        al3.add("three");
        al3.add("four");
        
        al3.add("ten");
        al3.add("eleven");
                
        System.out.println("al3: " + al3);
        
        
        System.out.println();
        
        
        
        int nTest = 9;
        switch(nTest) { 
            case 1: testRemoveAll(al1, al2, al3); break;
            case 2: testRetainAll(al1, al2, al3); break;
            case 3: testContainsAll(al1, al2, al3); break;
            case 4: testSubList(al1); break;
            case 5: testToArray(al1); break;
            case 6: testListOf(); break;
            case 7: testListCopyOf(al1); break;
            case 8: testButAvoidThis(al1); break;
            case 9: studyMap(); break;
        }
    }
    
    
    static void testRemoveAll(Collection <?> al1,
                              Collection <?> al2,
                              Collection <?> al3){
            //boolean Collection.removeAll(Collection <> c) - method
            //returns false in case there is nothing to remove
        System.out.println("removeAll(al2) = " + al1.removeAll(al2));
        System.out.println("al1: " + al1);
        System.out.println("removeAll(al3) = " + al1.removeAll(al3));
        System.out.println("al1: " + al1);
    } 
    
    static void testRetainAll(Collection <?> al1,
                              Collection <?> al2,
                              Collection <?> al3){
        //boolean Collection.removeAll(Collection <?> c) - method
            //returns false in case there is nothing to remove
        System.out.println("retainAll(al2) = " + al1.retainAll(al2));
        System.out.println("al1: " + al1);
        System.out.println("retainAll(al3) = " + al1.retainAll(al3));
        System.out.println("al1: " + al1);
    }
    
    static void testContainsAll(Collection <?> al1,
                              Collection <?> al2,
                              Collection <?> al3){
        //boolean Collection.containsAll(Collection <?> c) - method
        //returns TRUE in case there are all items of a12 in al1
        System.out.println("al1.containsAll(al2) = " + al1.containsAll(al2));
        
    }
    
    static void testSubList(List <String> al1){
        //List List.subList(int fromIndex, int toIndex) - method
        System.out.println("al1.sublist(0,0) = " + al1.subList(0, 0));
        System.out.println("al1.sublist(0,1) = " + al1.subList(0, 1));
        System.out.println("al1.sublist(2,2) = " + al1.subList(2, 2));
        System.out.println("al1.sublist(2,3) = " + al1.subList(2, 3));
        System.out.println("al1.sublist(2,4) = " + al1.subList(2, 4));
        System.out.println("al1.sublist(2,3) = " + al1.subList(0, 6));
        
        List <String> sublist = al1.subList(1,4);
        sublist.add("TEN");
        System.out.println("al1: " + al1);
        System.out.println("sublist: " + sublist);
        
        al1.add("MILLION");
        System.out.println("al1: " + al1);
        //causes CONCURRENT-MODIFICATION-EXception:
        //System.out.println("sublist: " + sublist);
        
    }
    
    static void testToArray(List <String> al1) {
        //Object[] List.toArray() - method
        Object [] array = al1.toArray();
        
        System.out.print("array: [");
        for(Object o:array){
            System.out.print(o +  ", ");
        }
        System.out.println("\b\b]");
        
        //abstract <T> T[] List.toArray(T[] arg)
        String [] array2 = al1.toArray(new String[10]);
        System.out.print("array: [");
        for(String s:array2){
            System.out.print(s +  ", ");
        }
        System.out.println("\b\b]");
    }
    
    public static void testListOf() {
        //Creating UNMUTABLE LIST
        //abstract static <T> T[] List.of(T[] arg)
        List <String> list = List.of("Odin", "Dva", "Tri");
        System.out.println("list: " + list);
        //Causes UNSUPPORTED-OPERATION-EXception
        //list.add("something");
        
    }
    
    public static void testListCopyOf(List <String> al1) {
        /*Creating UNMUTABLE LIST from the sample
         *
         * public static <E> List<E> copyOf
         *      (Collection<? extends E> coll)
         */
        List <String> list1 = List.copyOf(al1);
        System.out.println("list1: " + list1);
        //This will cause NULL-POINTER=EXception:
        //al1.add(null);
        //List <String> list2 = List.copyOf(al1);
        
    }
    
    
    public static void testButAvoidThis(ArrayList <?> list) {
      
        //RAW-Types and GENERICS <>
        for(Object o:list){
            System.out.println("Number = " + o + " and length = " + 
                        //Next could potentially cause 
                        //CLASS-CAST-EXception
                        ((String)o).length());
        }
        
        
    }
    
    /*  Collections is an Interface
     *  It has its "main" children:
     *  Interfaces List, Set, Queue 
     *  and Map (very popular is its implementation class HashMap
     *
     *  Class ArrayList implements interface List.
     *  Collection List the next added element is last
     *
     *  Class LinkedList imlements interface List
     *  AItem is linked with its neighboors, except the head and tail items.
     *  they are linked only with one existing neighboor.
     *   
     *  Set doesn't save information where a new item was actually added.
     *  Classes implementing Set are HashSet and TreeSet
     *
     *  Interface Queue : Rule FIFO
     *  Its inheritance interface Dequeue has rule LIFO
     *   
     *  Map has field key and value
     *  Classes implementing Map are HashMap and TreeMap
     */
    static void studyMap(){
        Map <Integer, String> map = new HashMap<>();
        map.put(777, "Suvorov Vassilii");
        map.put(778, "Sirotin Georgii");
        map.put(779, "Yurischev Wladimir");
        map.put(780, "Gots Sergei");
        
        System.out.println(map);
        
        map.put(781, "Roberto Carlos");
        
        System.out.println(map);
        
        map.put(781, "Audio-Padwik Jacob");
        System.out.println(map);
        
        map.put(782, "Test worker");
        System.out.println(map);
       
        map.remove(782);
        System.out.println(map);
        
    }
}
