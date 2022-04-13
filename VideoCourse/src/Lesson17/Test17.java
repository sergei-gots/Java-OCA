 
package Lesson17;

class Car{
    //String engine;
}

 
public class Test17 {
    
    public static void main(String[] args) {
        
   //capacity by default = 16
   StringBuilder sb1 = new StringBuilder(); 
   //Hier capacity is 24: byDef + length("Good Day!")
   StringBuilder sb2 = new StringBuilder("Good Day!");
   //StringBuilder with capacity = 50 
   StringBuilder sb3 = new StringBuilder(50);
   //StringBuilder which is identical by content to sb3-instance
   StringBuilder sb4 = new StringBuilder(sb3);
   
   
        System.out.println(sb1.length());
        System.out.println(sb2.charAt(4));
        //IndexOf ! Operates upon argument which should be STRING!
        System.out.println(sb2.indexOf("o", 2));
        //substring from the startIndex till (endIndex-1)!
        String s = sb2.substring(5, 8);
        System.out.println(s);
        
        //subSequence returns CharSequence-instance
        System.out.println(sb2.subSequence(5, 8));
        
        //append returns StringBuilder (without creation)
        sb2.append(22);
        System.out.println(sb2);
        sb2.append(sb2);
        System.out.println(sb2);
        
        sb2.append(true);
        System.out.println(sb2);
        sb2.append("Hello");
        System.out.println(sb2);
        //Visual representation Java of an object of the Class Car
        //Visual reprentation can be overloaded with the method toString()
        sb2.append(new Car());
        System.out.println(sb2);
        
        //insert -> StringBuilder
        StringBuilder sb5 = new StringBuilder("Good Day!");
        System.out.println(sb5.insert(5, 55));
        System.out.println(sb5.insert(11, " Hello"));
        
        //deleteCharAt -> StringBuilder
        StringBuilder sb6 = new StringBuilder("Hello World!");
        System.out.println(sb6.deleteCharAt(9));
        
        //reverse -> StringBuilder
        StringBuilder sb7 = new StringBuilder("Hello World!");
        System.out.println(sb7.reverse());
        
        //replace -> StringBuilder
        StringBuilder sb8 = new StringBuilder("Hello World!");
        System.out.println(sb8.replace(6, 11, "Everyone"));
        
        
        //Method chaining
        StringBuilder sb9 = new StringBuilder("Hello friend!");
        sb9.append(", how are you?").delete(sb9.indexOf("!"),
            sb9.indexOf("!")+1);
        System.out.println(sb9);
        
        
        
        
        
    }
}
