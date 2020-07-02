import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
    Scanner m = newScanner();
    int x = getnum(m);
    int y = getnum(m);
    System.out.printf("The length = %.3f, The angle is %.3f ", length(x,y), angle(x,y));

    }
    public static double length(double x, double y)
    {

        return Math.sqrt(x * x + y*y);
    }

    public static double angle(double x, double y)
    {

        return Math.signum(y * Math.acos(y/x) ) * Math.acos(x/length(x,y));
    }
    private static Scanner newScanner()
    {
        System.out.println("Enter (x,y):");
        return new Scanner(System.in);
    }
    private static int getnum(Scanner scan)
    {

        return scan.nextInt();
    }
}
