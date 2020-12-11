import java.util.Arrays;
import java.util.Scanner;
public class Exec6 {
	
    public static void main(String[] args) {
        int a[],b[],c[];
        a = new int[10];
        b = new int[10];
        c = new int[10];
        Scanner sett = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("a = numero " + i+ ": ");
            a[i] = sett.nextInt();
        }
        
        for(int i = 0; i<10; i++){
            System.out.println("b = numero " + i+ ": ");
            b[i] = sett.nextInt();
        }
        
        for(int i = 0; i<10;i++){
            for(int l = 0; l <10; l++){
                if(a[i] == b[l]){
                    c[i] = a[i];
                }
            }
            sett.close();
        }
        System.out.println(Arrays.toString(c));
        
    }
}
