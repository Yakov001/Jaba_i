import java.util.Scanner;
/*
as you can see the number of / and \ depends on the number of string we want to print. For example, we want to print
in the upper left quarter "/" if char's position is bigger or equal n/2 - i + 1 and less or equal n/2.
Generalising this idea on other quarters we can solve this issue.
 */
public class Diamond {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<= n; i++){
            System.out.println(onestr(i, n));
        }
    }
    public static String onestr(int i, int n){
        int j;
        String x = "";
        if( i<= n/2){                  //if we are in upper half
            for( j =1; j<=n/2; j++ ){  //first we iterate on the upper left fourth
                if( j < (n/2 - i+1)){ // if now we are not in allowed interval we should add space
                    x += " ";
                }
                else{
                    x+= "/";          // if we are in allowed interval we should add slash
                }
            }
            for(j=j ; j<=n; j++){       //now we iterate on the upper right fourth
                if( j <= (n/2 + i)){
                    x += "\\";
                }
                else{
                    x+= " ";
                }

            }
        }
        else{                             //similarly for the down half
            i = n - i;
            for(j =1; j<=n/2; j++ ){
                if( j < (n/2 - i)){
                    x += " ";
                }
                else{
                    x+= "\\";
                }
            }
            for(j=j ; j<=n; j++){
                if( j <= (n/2 + i+1)){
                    x += "/";
                }
                else{
                    x+= " ";
                }

            }
        }
        return x;
    }
}
