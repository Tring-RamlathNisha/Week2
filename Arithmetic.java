
import java.util.Scanner;

public class Arithmetic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        try { 
            System.out.println("Division of "+a +" by "+ b +" is "+a/b);
             
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed..");
        }
    }
}