import java.util.Scanner;
abstract class Shape
{
    int a,b;
    Shape(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    abstract void printArea();
    
}
class Rectangle extends Shape
{
    Rectangle(int l,int b)
    {
        super(l,b);

    }
    void printArea()
    {
        System.out.println("Area of Rectangle ="+(a*b));
    }
    
}
class Triangle extends Shape
{
    Triangle(int height,int base)
    {
        super(height,base);
    }
    void printArea()
    {
        System.out.println("Area of Triangle = "+(0.5*a*b));
    }
}
class Circle extends Shape
{
    Circle(int r)
    {
        super(r,0);
    }
    void printArea()
    {
        System.out.println("Area of Circle = "+(3.14*a*a));

    }
}
public class AbstractArea
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the dimensions of rectangle(length, breadth) :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        Rectangle rec= new Rectangle(n1,n2);
        rec.printArea();
        System.out.println("Enter the dimensions of Triangle(height, base) :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        Triangle tri =new Triangle(n1,n2);
        tri.printArea();
        System.out.println("Enter the dimension of circle(radius) :");
        n1=sc.nextInt();
        Circle cir=new Circle(n1);
        cir.printArea();
    }
}
