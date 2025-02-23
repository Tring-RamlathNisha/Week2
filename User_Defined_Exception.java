
import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String m){
        super(m);
    }
}

public class User_Defined_Exception{
    public static void validate(int age) throws InvalidAgeException {
       
     if(age <18){
            throw new InvalidAgeException("Age must be 18 or above...");

    }     
    System.out.println("Valid Age !");   
    }

    public static void main(String[] args) {
     try {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age:");
        
        int age =sc.nextInt();
        validate(age);
     } catch (InvalidAgeException e) {
        System.out.println("Caught Exception: "+e.getMessage());
     }   
    }
}