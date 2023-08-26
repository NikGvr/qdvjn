package qdvjn;
import java.util.* ;
import java.io.* ;

public class Cmain {
    
    static String verification(String username, String password){
       
        String ValueToReturn = "" ;
        
        if(username.equals("makis") && password.equals("1234")){
            ValueToReturn = "yes" ;
        }else{
            ValueToReturn = "no" ;
        }
        
        return ValueToReturn ;
       
        
    }
    
    static String CollectPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        String b = sc.nextLine() ;
        return b ;
    }
    
    static String CollectUsername(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String a = sc.nextLine() ;
        return a ;
    }
    
    public static void main(String[] args) throws IOException{
        
         Scanner sc = new Scanner(System.in);
        
        String command ;
        String username ;
        String password ;
        String message ;
        String verify ;
        
        username = CollectUsername() ;
        password = CollectPassword() ;
        
        String verificationword = verification(username, password) ;
        
        while( !verificationword.equals("yes")){
           
            System.out.println("wrong username or password. Try again" );
            
            username = CollectUsername() ;
            password = CollectPassword() ;
            
            verificationword = verification(username, password) ;
            
            if(verification(username, password).equals("yes")){
                System.out.println("Successfull login");
                break ;
            }
            
        }
        
        
    }
    
}
