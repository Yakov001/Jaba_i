import java.util.Scanner;
public class Levon {
    public static void main(String[] args)
    {
        String word = "Tiny Dancer";
        double radius = 19.7;
        Scanner textScanner = new Scanner( "Madman across the water!" );
        test( word, textScanner, radius );
        System.out.println( radius );
        System.out.println( word );
        System.out.println( textScanner.next() );
    }
    public static void test(String w, Scanner t, double r)
    {
        w = "Levon";
        r = 4.5;
        System.out.print(t.next());
    }
}
