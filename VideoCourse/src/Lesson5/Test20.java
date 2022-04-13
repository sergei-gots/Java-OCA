package Lesson5;

public class Test20 {

    int summ(int a, int b, int c){
        int result=a+b+c;
        return result;
    }
    
    
    int average(int a1, int b1, int c1){
        int result2 = summ(a1, b1, c1)/3;;
        return result2;
    }
}


class Test21 {

    public static void main(String[] args){
        Test20 t = new Test20();
        int summaTrexChisel = t.summ(1, 2, 3);
        System.out.println(summaTrexChisel);
        System.out.println(t.summ(5,10,'d'));
        
        System.out.println(t.average(20, 40, 60));
    }
}
