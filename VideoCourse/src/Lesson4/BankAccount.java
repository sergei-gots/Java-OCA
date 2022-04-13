package Lesson4;


//Difference between PRIMITIVE and REFERENCE data types
// int a = 5; //Variable a contains its value = 5
//BankAccount BA = new BankAoccount(); //new BankAccount creates in a memory area
                                        //an Object.
             //But BA doesn't contain the Object, it contains an adress of the Oject
             //So that this Data Type is called REFERENCE DATA TYPE
             //BA's value = some adress //a pointer, reference 

             //CONSTRUCTOR is a tool that creates instances of the class.
             

//Any CLASS in Java is a DATA TYPE
//It's a REFERENCE DATAT TYPE
public class BankAccount {

    int id = 10;
    //Class String is an unique class. Instances of this String class
    //can be created in two ways:
    //String name = "Petr";
    String name = new String("Petr");
    double balance = 100;
    //This are INSTANCE VARIABLES. The every created object (instance) will have 
    //this variables.
    //Variables here (AKA CLASS FIELDS) could be declared without values assignment
    //And they will have DEFAULT data types VALUES:
    
        //For integer data types    - 0
        //For float and double      - 0.0
        //For char                  -  '\u0000 (hex) or 0 (decimal)
        //For boolean               - false
        //For reference d.t.        - null
    
       
    double refill(double amount) {
        System.out.println("Account #" + id 
                    + ". balance: " + balance + ". ");
        System.out.println("Account will be refilled with the amount of " 
                    + amount + ". "); 
        balance+=amount;        
        System.out.println("Account balance after refill: " 
                    + balance + ". "); 
        return balance;
    }
    
    double withdrawal(double amount){
        System.out.println("Account #" + id 
                    + ". Balance: " + balance + ". ");
        System.out.println("Account will be withdrawn with the amount of " 
                    + amount + ". "); 
        balance-=amount;        
        System.out.println("Account balance after refill: " 
                    + balance + ". "); 
        return balance;
    }
}


class BankAccountTest{
    
    public static void main(String[] args){
    
            //Creation of an instance of the BankAccount class
            //BankAccount - Var. Data Type
            //MyAccount - Var. Name
            //MyAccount variable contains the information about
            //an adress of the object MyAccount.
            //new BankAccount() - Var. value;
                //new means that a new Object will be created
                //BankAccount - type of the Object
            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();
    
            
            //Assigning (changing)  values to the INSTANCE VARIBABLES
            MyAccount.id = 1;
            //MyAccount.name = "Sergei";
            MyAccount.balance = 12.35;
            
            YourAccount.id = 2;
            YourAccount.name = "Zaur";
            YourAccount.balance = 124.12;
            
            YourAccount.id = 3;
            YourAccount.name = "Ivan";
            YourAccount.balance = 2.00;
            
            System.out.println(MyAccount.id);
            System.out.println(MyAccount.name);
            System.out.println(MyAccount.balance);
            System.out.println(YourAccount.name);
            System.out.println(YourAccount.balance);
            
            System.out.println("My account. Balance: " 
                    + MyAccount.balance);
            System.out.println("My account is refilled. Balance: " 
                    + MyAccount.refill(50));
            System.out.println("Withdrawn from the account. Balance: " 
                    + MyAccount.withdrawal(33.4d));
            
                       
    }
    
}