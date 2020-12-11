import java.util.Arrays;
import java.util.Scanner;
public class Exec8 {
public static void main(String[] args) {
        
	    int a[];
        a = new int[10];
        Scanner sett = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("numero " +i+ ": ");
            a[i] = sett.nextInt();

            if (a[i] !=5) {
            System.out.println(Arrays.toString(a));
            System.out.println("o numero ainda nao esta presente/ ou ja esta presente em outra posicao");
            }else
            	System.out.println(Arrays.toString(a));
            	System.out.println("o numero 5 esta presente nesta posicao"); 
      
       }
        sett.close();
  }
 }