 
package Lesson19;

 
public class Test2 {

    static void summ(int a, int b){
        System.out.print("Test2.summ(a,b): ");
        System.out.println(a+b);
    }
    
   /* static void summ(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    static void summ(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }*/
    //VARAGRS-parameter METHOD
    //VARARGS-parameter can be only ONE in the list of ARGS
    
        //1. VARAGS is declared as DATA_TYPE ... VARARGS_NAME 
        //2. VARAGS can be only ONE within list of args
        //3. VARAGS must be LAST in the list of args
        //4. VARAGS can't be overloaded with []-arg of the same type
        //5. VARAGS inside the JAVA looks like an array
    static void summ(int ...a){
        int nSumm=0;
        for(int i=0; i<a.length; i++){
            nSumm+=a[i];
        }
        System.out.print("Test2.summ(int ...a): ");
        System.out.println(nSumm);
    }
    
   /* static void summ(int[]a){
        int nSumm=0;
        for(int i=0; i<a.length; i++){
            nSumm+=a[i];
        }
        System.out.println(nSumm);
    }*/
    
    
    static void summ(String s, int ...a){
        System.out.print("Test2.summ(Sting s, int ...a).\n\t String s: ");
        System.out.print(s);
        if(a==null) {
            System.out.println(", a is NULL,");
            //return;
        }
        else{
            System.out.print(", summ:");
        }
        
        int nSumm=0;
        for(int i=0; i<a.length; i++){
            nSumm+=a[i];
        }
        System.out.println(nSumm);
       
    }
    
    static void summ(String s, int a){
        System.out.print("Test2.summ(Sting s, int a).\n\t String s: ");
        System.out.print(s);
        System.out.print(", int a:");
        System.out.println(a);
        
    }

    public void abc(int[] ... array){
    }
    
    //NOTE: "String[] args" can be declared here as "String .. args"
    public static void main(String ... args) {
        summ(0);
        summ(6,3);
        summ(new int[2]);
        summ(new int[] {1,3,5});
        //summ(new {0,1}); - incorrect 
        summ(6,3,10);
        summ(new int[6]);
        summ("ok");
        summ("ok", 4);
        summ("ok", 4, 6);
        
        summ("should fail", null);
    }
}
