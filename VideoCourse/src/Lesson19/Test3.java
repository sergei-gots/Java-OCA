 
package Lesson19;

 
public class Test3 {
    public static void main(String[] args) {
        int [] array = {0,6,4,1};
        
        System.out.print("{ ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println("}");
        
        System.out.print("{ ");
        
        //Java itself converts this foreach-loop into traditional representation
        for(int a : array) {
            System.out.print(a + " ");
        }
        System.out.println("}");
    }
}
