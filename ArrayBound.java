
import java.util.Scanner;

public class ArrayBound{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        try{
        arr[n]=1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception");
        }
    }
}