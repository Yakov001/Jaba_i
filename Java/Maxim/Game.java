import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        game();
    }
    public static void game(){
        int chips = 50;
        Scanner in = new Scanner(System.in);
        int betAmount, par,i;
        boolean z;
        for(i = 1; i <= 10; i++) {
            System.out.println(" =============================== ");
            System.out.println(" This is round " + i);
            System.out.println(" You have " + chips + " chips ");
            System.out.print(" How much do you want to bet ? ");
            betAmount = in.nextInt();
            if (betAmount <= 0) {
                betAmount = 1;
            }
            else if (betAmount > chips) {
                throw new IllegalArgumentException(
                        "You entered wrong bet amount"
                );
            }
            chips -= betAmount;
            System.out.print(" Enter your bet type : ");
            System.out.println(" -1 for odd , 0 for even ,");
            System.out.print(" 1..6 for an exact bet : ");
            par = in.nextInt();
            if (par == -1) {
                z = false;
                chips += oneround(z, betAmount);
            }
            else if (par == 0) {
                z = true;
                chips += oneround(z, betAmount);
            }
            else if (par < -1 || par > 6) {
                throw new IllegalArgumentException(
                        "You entered wrong bet"
                );
            }
            else{
                chips+=oneround(par, betAmount);
            }
            if (chips <= 0){
                break;
            }
        }
        System.out.printf("You played %d games and you have %d chips", i, chips);
    }
    public static long oneround(boolean par, long ch){
        long z = Math.round(0.5 + 6 * Math.random());
        System.out.println("The dice shows: "+ z);
        boolean b = z % 2 == 0;
        if (b == par)
        {
            return ch *2;
        }
        else {
            return 0;
        }
    }
    public static long oneround(int par, long ch){
        long z = Math.round(0.5 + 6 * Math.random());
        System.out.print("The dice shows: "+ z);
        if (z == par)
        {
            return ch *6;
        }
        else {
            return 0;
        }
    }
    public static void bet(){

    }
}
