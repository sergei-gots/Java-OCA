package Homework;

public class Lesson16 {
}
        
class EMailAddress {
    
    String address;
    String serverName;
    boolean validated;
    
    public EMailAddress(String address){
        this.address = address;
        this.serverName = detectServerName();
        printInfo();
    }
    
    public void printInfo(){
        System.out.print("Email address \"" + address );
        if(validated){
                System.out.println("\". Name of the server is \"" + serverName + "\".\n");
        }
        else {
                System.out.println("\" is not a valid address.\n");
        }
            
    }
    
    void printIncorrectAddress(String cause){
            System.out.println("The e-mail address \""
                    + address 
                    + "\" isn't correct: there is " + cause + '.');
    }
    
    public String detectServerName(){
        
        validated = false;
        serverName = null;
                
        char c1 = address.charAt(0);
        if(c1>='0' && c1<='9'){
            printIncorrectAddress("DIGIT as a first symbol in the USERNAME");
            return null;
        }
        
        int nAtIndex = address.indexOf('@');
        //nAtIndex==-1 => There isn't any '@'
        if(nAtIndex<1){
            printIncorrectAddress(" not '@'");
            return null;
        }    
        //nAtIndex==0 => '@' is the 1st symbol
        //length<nAtIndex+4 => there aren't enough symbos after '@' to form address
        if(address.length()<nAtIndex+4){
            printIncorrectAddress("incorrect SERVERNAME");
            return null;
        }
        
        String server = address.substring(nAtIndex+1);
        
        int nAtIndex2 = server.indexOf('@');
        if(nAtIndex2>0) {
            printIncorrectAddress(" more than one \'@\'-SYMBOL in the string");
            return null;
        }
        
        int nLastPointIndex = server.lastIndexOf('.');
        
        if(nLastPointIndex<1 || server.length()<nLastPointIndex+2){
            printIncorrectAddress(" incorrect SERVERNAME");
            return null;
        }
        
        serverName = server.substring(0, nLastPointIndex);
        validated = true;
        return serverName;
    }
    
    public static void printServerCoreNames(String s){
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='@'){
                for(i++, c=s.charAt(i); c!='.'; i++, c=s.charAt(i)) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        
        System.out.println("");
        
        int nAtIndex = 0;
        int nPointIndex = 0;
        int nSemicolonIndex = 0;
        
        while(nSemicolonIndex!=-1 && nSemicolonIndex<s.length()) {
            nAtIndex = s.indexOf('@', nSemicolonIndex);
            nPointIndex = s.indexOf('.', nSemicolonIndex);
            nSemicolonIndex = s.indexOf(';', nSemicolonIndex+1); 
            
            System.out.println(s.substring(nAtIndex+1, nPointIndex));
            
        }
    }
}


class eMailAddressTest {
    
    public static void main(String[] args) {
        
        EMailAddress eMail1 = new EMailAddress("No@name.@strange.txt.com");
        EMailAddress eMail2 = new EMailAddress("Noname2.strange.txt@.com");
        EMailAddress eMail3 = new EMailAddress("Noname3.strange.txt@dad.");
        EMailAddress eMail4 = new EMailAddress("Noname4.strange.txt@.");
        EMailAddress eMail5 = new EMailAddress("Noname5.strange.txt@.a");
        EMailAddress eMail6 = new EMailAddress("1Noname4.strange.txt@.a");
        EMailAddress eMail7 = new EMailAddress("a@b.c");
        EMailAddress eMail8 = new EMailAddress("Serge.Gots@gmail.com");
        EMailAddress eMail9 = new EMailAddress("Sergei.Gots@netbeans.apache.org");
        
        EMailAddress.printServerCoreNames("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }
}