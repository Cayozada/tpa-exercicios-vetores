import java.util.Arrays;
import java.util.Scanner;
public class Exec10 {
public static void main(String[] args) {
        
	    int a[];
        a = new int[10];
        Scanner sett = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("numero " +i+ ": ");
            a[i] = sett.nextInt();

        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        sett.close();
   }
}