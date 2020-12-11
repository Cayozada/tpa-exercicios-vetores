import java.util.Scanner;
public class Exec1 {
    
    public static void main(String[] args) {
        int N, quantp, quantii;
        String a[],b[];
        N = 20;
        quantp = 0;
        quantii = 0;
        a = new String[N];
        b = new String[N];
        Scanner sett = new Scanner(System.in);
        
        for(int i = 0; i < N; i++){
            
            System.out.println("numero " +i+ ": ");
            a[i] = String.valueOf(sett.nextInt());
            if(Integer.valueOf(a[i])%2 != 0){
                quantii++;
            }else{
                quantp++;
            }
        }
        
        for(int i = 0; i<N; i++){
            if(Integer.valueOf(a[i])%2 != 0){
                b[i] = a[i];
                a[i] = "§";
            }else{
                b[i] = "§";
            }
            
        }
        
        System.out.println("quant pares: " +quantp);
        
        for(int i = 0; i<N; i++){
            if(!a[i].equals("§")){
                System.out.println(a[i]);
            }
        }
        
        System.out.println("quant impares: " +quantii);
        
        for(int i = 0; i<N; i++){
            if(!b[i].equals("§")){
                System.out.println(b[i]);
            }
            sett.close();
        }
        
    }
}

