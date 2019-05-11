import java.util.ArrayList;
import java.util.Scanner;

public class apple {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double desktall;
        int amount;
        double tall ;
        tall=in.nextInt();
        desktall=in.nextInt();
        amount=in.nextInt();
        double [] s=new double[amount];
        double x=0;
        double y;
        double n = 0;
        int a=0;

            for (int i = 0; i < amount; i++) {
                s[i] = in.nextInt();
                if (tall + desktall >= s[i]) {
                    a++;
                }

            }
            System.out.println(a);
        }




    }


