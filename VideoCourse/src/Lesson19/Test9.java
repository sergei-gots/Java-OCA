 
package Lesson19;

 
public class Test9 {
    public static void main(String[] args) {
        int [] array1 = {3,1,-2,0};
        int [] array2 = {-9,1,5,2};
        //TRADITIONAL LOOP
        for(int i=0; i<array1.length && i<array2.length; i++){
            //IT CAN CHANGE THE ARRRAY's ITEM VALUE
            //IT CAN WORK WITH ANY AMOUNT OF ARRAYS SIMULTANEOUSLY:
            array1[i]=3;
            array2[i]=12;
        }
        
        for(int a:array2){
            //FOR-EACH LOOP:
            //IT DOESN'T CHANGE THE ARRRAY's ITEM VALUE
            //IT IS IMPOSSIBLE TO WORK WITH MORE THAN ONE ARRAY
            a=2;
        }
            
    }
 
}
