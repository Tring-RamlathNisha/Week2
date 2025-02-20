
import java.util.Scanner;

class Shape{
    public void area(){
        System.err.println("Area of Shape is not implemented...");
    }
}
class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public void area(){
        int ar=length*width;
        System.out.println("Area of rectangle is "+ ar);    
    }
}

class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    public void area(){
        int ar=2 *(22/7)*radius;
        System.out.println("Area of circle is "+ ar);    
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape sp = new Shape();
        System.out.print("Enter length of Rectangle:");
        int len =sc.nextInt();
        System.out.print("Enter width of Rectangle:");
        int wid =sc.nextInt();
        Shape rec = new Rectangle(len,wid);
        System.out.print("Enter radius of circle:");
        int rad =sc.nextInt();
        Shape cir = new Circle(rad);
        sp.area();
        rec.area();
        cir.area();
        sc.close();


    }
}