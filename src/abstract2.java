import java.util.Scanner;
interface shape{
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double calculatePerimeter(){
        return Math.PI*radius*2;
    }
}
class Rectangle implements shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double calculateArea(){
        return length*width;
    }
    @Override
    public double calculatePerimeter(){
        return 2*(length+width);
    }

}
public class abstract2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius=sc.nextInt();
        Circle c=new Circle(radius);
        System.out.println("Area: "+c.calculateArea());
        System.out.println("Perimeter: "+c.calculatePerimeter());
        System.out.print("Enter length of rectangle: ");
        double l=sc.nextInt();
        System.out.print("Enter width of rectangle: ");
        double r=sc.nextInt();
        Rectangle rectangle=new Rectangle(l, r);
        System.out.println("Area: "+rectangle.calculateArea());
        System.out.println("Perimeter: "+rectangle.calculatePerimeter());

    }
}
