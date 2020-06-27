import java.util.Scanner;
/*
I calculate the area of regular polygon
 */

public class Polygon {
    public static void main(String[] args)
    {
        Scanner input = newScan();
        double l = input.nextDouble();
        int v = input.nextInt();
        System.out.printf("The Area is %.2f ", Area(v,l));
    }

    public static Scanner newScan()
    {
        System.out.println("First enter length and then number of vertices");
        return new Scanner(System.in);
    }
    public static double Area(double v, double l )
    {
        double angle = Math.PI* (0.5 - 1/v) ;
        double h = Math.tan(angle) * l/2;
        return h * l /2 * v;
    }
}
