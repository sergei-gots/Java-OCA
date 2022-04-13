 
//package Homework;

 
public class Lesson19 {
    
    static String [] abc(String [] ... sArrayIn){
        if(sArrayIn==null) {
            return null;
        }
            
        int length=0;
        for(String[] sArray:sArrayIn){
            if(sArray!=null) {
                length+=sArray.length;
            }
        }
        
        String []sArrayOut = new String[length];
        int count=0;
        for(String[] sArray:sArrayIn){
            if (sArray==null) {
                continue;
            }
            for(String s:sArray){
                if(s!=null){
                    sArrayOut[count] = new String(s);
                }
                count++;
            }
        }
        return sArrayOut;
    }
    
    static void print(String [] sArray) {
        if(sArray == null){
            System.out.println("null.");
            return;
        }
        
        boolean bIsNotEmpty = false;
        for(String s:sArray) {
            bIsNotEmpty = true;
            System.out.print(s + ", ");
        }
        if (bIsNotEmpty) {
            System.out.print("\b\b.");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {

        String [] sArray1 = {};
        String [] sArray2 = { null, null };
        String [] sArray3 = { "Hello", "Bye", "Ok" };
        String [] sArray4 = { "One", "Two", "Three", "Three", "It's me"};
        
        System.out.println("TEST CODE:");
        print(abc(null));
        print(abc(sArray1));
        print(abc(null, sArray1));
        print(abc(sArray2));
        print(abc(sArray2, null, sArray3));
        print(abc(null, sArray1, sArray2, null, sArray3));
        
        System.out.println();
        
        if(args.length==0) {
               System.out.println("There arent't any input parameters in the call of this apploication.\n");
        }
        else {
            System.out.println("PARAMETERS ARE:");
            print(args);
        }    
        System.out.println("TEST SEQUENCES are:");
        print(sArray3);
        print(sArray4);

	String [] sArrayTestSequence = abc(
                new String[] { "null", "null"}, 
                sArray3, 
                sArray4);
        
	String [] sOutputSequence = null;
	System.out.println("TEST SEQUENCE IS:");
	print(sArrayTestSequence);
	if(sArrayTestSequence!=null) {
		int argsLength = sArrayTestSequence.length; 
		sOutputSequence = new String [argsLength];
		for(int i = 0; i<argsLength; i++){
			String s = sArrayTestSequence[i];
			sOutputSequence[i] = s;
                        for(String sArg:args) {
			    if (sArg.equals(s )) {
                                sOutputSequence[i]=null;
                            }
			}
		}
	}

        System.out.println("OUTPUT SEQUENCE IS:");
        print(sOutputSequence);
    }
}
