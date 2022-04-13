 
package Lesson19;

 
public class Test7 {
//ENHANCED FOREACH-LOOPS   
    public static void main(String[] args) {
        
        System.out.println("Primitive-DataTypes");
        int[] array = { 0, 6, 4, 1};
        for(int a:array){
            a=3;
        }
         //BUT! Array items haven't change therir values:
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
        System.out.println("REF-DataTypes");
        
        String[] sArray = { "Privet", "Poka", "Ok"};
        for(String s:sArray){
            s=new String("Hello");
        }
        //HERE there is the same:
        //Array items haven't change therir values:
        for(int i=0; i<sArray.length; i++){
            System.out.print(sArray[i] + " ");
        }
        System.out.println();
        
        //AND NOW there is a StringBuilder-array:
        StringBuilder[] sbArray = { new StringBuilder("Privet"),
            new StringBuilder("Poka"),
            new StringBuilder("Ok") };
            for(StringBuilder sb:sbArray){
                sb=new StringBuilder("Hello");
        }
        //AND HERE IS THE SAME!
        for(int i=0; i<sbArray.length; i++){
            System.out.print(sbArray[i] + " ");
        }
        System.out.println();
        
        
        //CHANGING REF-OBJECTS within an ARRAY:
        //HERE  REF-Objects 
        //(ACTUALLY - VALUES OF OBJECTS 
        //will be CHANGED! :
        for(StringBuilder sb: sbArray) {
            sb.append(".java");
        }
        
        for(int i=0; i<sbArray.length; i++){
            System.out.print(sbArray[i] + " ");
        }
        System.out.println("");
        
    }
}
