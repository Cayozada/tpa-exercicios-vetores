import java.util.Scanner;
public class Exec2 {
	
    public static void main(String[] args) {
        Scanner sett = new Scanner(System.in);
        final int N = 5;
        int i, a[];

        a = new int [N];
        for(i =0; i<N; i++) {
            System.out.println("numero "+i+ " :");
            a[i] = sett.nextInt();

            int n = 0;
            for (n=0; n<=10;n++) {
             int r = a[i]*n;
             System.out.println(a[i]+"x"+n+" = "+r);
                if (i == 10) {
                    a[i] = a[1];
                    a[1] = a[2];
                    a[2] = a[3];
                    a[3] = a[4];
                    a[4] = a[5];
                    n = 0;
                sett.close();
         }
       }
     }
   }
}