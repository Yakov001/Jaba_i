import java.util.Scanner;

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
        if( i<= n/2){
            for( j =1; j<=n/2; j++ ){
                if( j < (n/2 - i+1)){
                    x += " ";
                }
                else{
                    x+= "/";
                }
            }
            for(j=j ; j<=n; j++){
                if( j <= (n/2 + i)){
                    x += "\\";
                }
                else{
                    x+= " ";
                }

            }
        }
        else{
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
