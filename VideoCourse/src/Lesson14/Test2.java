 
package Lesson14;

 
public class Test2 {
    
    public static void main(String[] args) {
        //int i=1;
        for(int i=5, j=10; i<11; i++, j+=20, abc(j)){
            System.out.println(i);
            i++;
            
        }
        //int i=10;
    }
    
    static void abc(int n){
        System.out.println("\t" + n);
    }
}
