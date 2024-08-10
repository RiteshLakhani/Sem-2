import java.util.Scanner;

public class Shape{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);

        int r , b , h , l ;

        System.out.println("Enter radius of circle: ");
        r = sc.nextInt();

        System.out.println("Enter Base of triangle: ");
        b = sc.nextInt();

        System.out.println("Enter Height of triangle: ");
        h = sc.nextInt();

        System.out.println("Enter Length of square: ");
        l = sc.nextInt();

        calmethod(r,b,h,l);
    }

    public static void calmethod(int r, int b, int h, int l)
    {
        System.out.println("Area of Circle=" +3.14*r*r);

        System.out.println("Area of triangle="+0.5*b*h);

        System.out.println("Area of square="+l*l);
    }
}
