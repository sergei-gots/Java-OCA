package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Lesson20 {
    static ArrayList sortAndClear(String ... str){
        int nCount = 0;
        ArrayList <String> list = new ArrayList <> ();
        for(String s:str){
            if(!list.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        
        /*Iterator <String> iterator = list.iterator();
        String s1=null, s2;
        if(iterator.hasNext()) {
            s1 = iterator.next();
        }
        while(iterator.hasNext()){
            s2 = iterator.next();
            if(s1.equals(s2)){
                iterator.remove();
            }
            
        }*/
        return list;
    }
    public static void main(String[] args) {
        System.out.println(sortAndClear());
        System.out.println(sortAndClear(""));
        System.out.println(sortAndClear("", ""));
        System.out.println(sortAndClear("", "1", ""));
        System.out.println(sortAndClear("a", "b", "c", "a"));
        System.out.println(sortAndClear("privet", "ok", "kak dela?", "ok", "hello", "privet", "poka"));
    }
}
