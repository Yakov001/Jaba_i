import java.util.Scanner;

public class Calendar {
    public static int numOfDays;
    public static int startDay;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main (String[]args){
        System.out.print ("How many days?: ");
        numOfDays = keyboard.nextInt();
        System.out.print ("Start position: ");
        startDay = keyboard.nextInt();

        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat  ");
        for (int i = 0; i < 7; i++){
            System.out.print("+------");
        }
        System.out.print ("+\n");

        if ( (numOfDays + startDay) % 7 == 0){
            int numOfRows = (numOfDays + startDay)/7;
            for (int row = 0; row < numOfRows; row ++){
                System.out.print("|");
                calendar( numOfDays, startDay, row);
                System.out.print("\n");
            }
        }
        else if ((numOfDays + startDay) % 7 != 0){
            int numOfRows = (numOfDays + startDay)/7 + 1;
            for (int row = 0; row < numOfRows; row ++){
                System.out.print("|");
                calendar( numOfDays, startDay, row);
                System.out.print("\n");
            }
        }
        for (int i = 0; i < 7; i++){
            System.out.print("+------");
        }
        System.out.print ("+\n");

    }

    public static void calendar ( int numOfDays, int startDay, int row){
        for (int column = 1; column <= 7; column ++){
            int dayIndex = 7 * row + column - startDay;
            if ( 0 < dayIndex && dayIndex <= numOfDays){
                System.out.printf( "%4d  |", dayIndex);


            }
            else {
                System.out.print("      |");
            }
        }

    }

}
