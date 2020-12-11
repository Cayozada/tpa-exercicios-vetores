import java.util.Arrays;
import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
        int a[],b[];
        a = new int[15];
        b = new int[15];
        Scanner sett = new Scanner(System.in);
        
        for(int i = 0; i<15; i++){
            System.out.println("numero " +i+ ": ");
            a[i] = sett.nextInt();
            
        }
        
        
        for(int i = 0; i < 15; i++){
            int fat = 1;
            for(int l = a[i]; l > 0; l--){
                
                fat = fat*l;
            }
            b[i] = fat;
        }
        
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        sett.close();
    }

}