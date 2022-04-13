 
package Homework.Lesson18;

 
public class Sort {
    public static int[] sortInt(int[] array){
        for(int i=0;i<array.length;i++){
            int min = array[i];
            int indexMin = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<min){
                    min = array[j];
                    indexMin = j;
                }
            }
            if(indexMin!=i){
                array[indexMin]=array[i];
                array[i]=min;
            }
        }
        return array;
    }
    
    public static void printArray(int [] array) {
        System.out.print("{ ");
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]);
            System.out.print(", ");
        }    
        System.out.println("\b\b }");
    }
    
    public static void printArray(String [][] array) {
        System.out.print("{");
        for(int i=0; i< array.length; i++){
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(" {");
            String[] arrayi = array[i];
            for(int j=0; j< arrayi.length; j++){
                if(j>0){
                    System.out.print(", ");
                }
                System.out.print(arrayi[j]);
            }
            System.out.print("}");
        }    
        System.out.println(" }");
    }
    
    public static void main(String[] args) {
        int[]array = { 3, 7, 8, 2, 0, 9, 14, -5 };
        Sort.printArray(array);
        Sort.sortInt(array);
        Sort.printArray(array);
        
        String[][] arrayStr1 = new String[0][];
        String[][] arrayStr2 = new String[1][0];
        String[][] arrayStr3 = new String[1][];
        arrayStr3[0]=new String[1];
        
        String[][] arrayStr4 = new String[3][];
        arrayStr4[0]=new String[0];
        arrayStr4[1]=new String[1];
        arrayStr4[2]=new String[2];
        
        Sort.printArray(arrayStr1);
        Sort.printArray(arrayStr2);
        Sort.printArray(arrayStr3);
        Sort.printArray(arrayStr4);
        
        arrayStr4[1][0]="It's me, Sergei:)";
        arrayStr4[2][0]="Hello";
        arrayStr4[2][1]="World";
        
        Sort.printArray(arrayStr4);
        
        String[][] sex = {{"man", "woman"}, {"male", "female", "non-binary"}};
        String[][] fruits = {{"cranberry", "raspberry"},
                {"apple", "orange", "avocado"}, {"onion"}};
        
        Sort.printArray(sex);
        Sort.printArray(fruits);
         
    }
}
