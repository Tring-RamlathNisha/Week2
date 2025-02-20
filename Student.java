
import java.util.Scanner;

public class Student {
    int roll_no;
    String name;
    int marks;
    public Student(String name,int roll_no,int marks){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    public void display_details(){
        System.out.println("\n==== Student Details ====");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roll_no);
        System.out.println("Marks: "+marks+"\n");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Student Name:");
        String name=sc.nextLine();
        System.out.print("Enter Student roll no:");
        int roll=sc.nextInt();
        System.out.print("Enter Student marks:");
        int mark=sc.nextInt();
        Student stud = new Student(name,roll,mark);
        stud.display_details();
        sc.close();

    }
}