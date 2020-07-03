import java.util.Scanner;

public class Circle {
    /* Solve 22 issue using only three variables myRadius, myFraction and Angle, if you use more than 3 variables,
    solution will be rejected, you shouldn't use ++ or +1 in loop.
     */
    public static void main (String[]args){
        double myRadius;
        int myFraction;
        int angle;
        Scanner notavariable = new Scanner(System.in);
        myRadius = notavariable.nextInt();
        myFraction = notavariable.nextInt();
        angle = 360 / myFraction;
        for ( myFraction = 360 / angle; myFraction > 0 ; myFraction --) {
            System.out.println(myRadius * Math.cos(radiansAngle(angle) * myFraction) +
                    " , " + myRadius * Math.sin(radiansAngle(angle) * myFraction));
        }
    }
    public static double radiansAngle (int angle){
        return Math.toRadians( angle );
    }
}