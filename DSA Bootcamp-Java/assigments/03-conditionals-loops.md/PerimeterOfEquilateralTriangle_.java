import java.util.Scanner;
class PerimeterOfEquilateralTriangle_
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the side of the Triangle:");

        double a= s.nextDouble();

        double  perimeter=3*a;

        System.out.println("perimeter of Triangle is: " + perimeter);
    }
}