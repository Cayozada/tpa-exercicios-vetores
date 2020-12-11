import java.util.Arrays;
import java.util.Scanner;

public class Exec7 {
     public static void main(String[] args) {
        int a[],b[],c[];
        a = new int[10];
        b = new int[10];
        c = new int[10];
        Scanner sett = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("a = Numero " + i+ ": ");
            a[i] = sett.nextInt();
        }
        
        for(int i = 0; i<10; i++){
            System.out.println("b = Numero " + i+ ": ");
            b[i] = sett.nextInt();
        }
        
        for(int i = 0; i<10;i++){
            boolean cont = false;
            for(int l = 0; l <10; l++){
                if(a[i] != b[l]){
                   if(l == 9 && !cont){
                     c[i] = a[i];
                    }
                }else{
                    cont = true;
                }
            }
        }  sett.close();            
        System.out.println(Arrays.toString(c));
        
    }
}

