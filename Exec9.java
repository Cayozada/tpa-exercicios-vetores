import java.util.Arrays;
import java.util.Scanner;
public class Exec9 {
public static void main(String[] args) {
        
	    int a[];
        a = new int[10];
        Scanner sett = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("numero " +i+ ": ");
            a[i] = sett.nextInt();
        }
        if(a[1] == a[9]) {
        	System.out.println(Arrays.toString(a));
        	System.out.println("palindromo");
        }else
        	System.out.println(Arrays.toString(a));
        	System.out.println("nao palindromo");
        sett.close();
  }
}