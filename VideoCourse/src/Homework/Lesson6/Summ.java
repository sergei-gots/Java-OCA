 
package Homework.Lesson6;
 
public class Summ {
    int summ(int a, int b, int c, int d){
        int result = a+b+c+d;
        System.out.println("Summ: " + result + ".");
        return result;
    }
    
    int summ(int a, int b, int c){
        return summ(a,b,c,0);
    }
    
    int summ(int a, int b){
        return summ(a,b,0,0);
    }
    
    int summ(int a){
        return summ(a,0,0,0);
    }
    
    int summ(){
        return summ(0,0,0,0);
    }
    
    public static void main(String[] args) {
        Summ homework_6_1 = new Summ();
        homework_6_1.summ();
        homework_6_1.summ(1);
        homework_6_1.summ(1,2);
        homework_6_1.summ(1,2,3);
        homework_6_1.summ(1,2,3,4);
    }
}
