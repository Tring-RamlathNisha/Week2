import java.util.Scanner;

public class Array{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n:");
        int n = sc.nextInt();
        int array[] = new int[n];
        /**
         * Get the elements as input
         */

        for(int i=0;i<n;i++){
            System.out.print("Enter val:");
            array[i] = sc.nextInt();
        }
        /**
         * Display the elements
         */
        
        System.out.println("Elements of array:");
        for(int i=0;i<n;i++){
            System.out.print(  array[i] + " ");
          
        }





    }
}