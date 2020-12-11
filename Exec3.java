import java.util.Scanner;
public class Exec3 {
	
	public static void main(String[] args) {
		Scanner sett = new Scanner(System.in);
		final int N = 10;
	    int i, a[];
	    a = new int [N];
    	
	    for(i =0; i<N; i++) {
        System.out.println("numero "+i+ ":");
    	a[i] = sett.nextInt();
    	if(a[i] == 5) {
    	System.out.println("primo");
    	}else if(a[i]%5 == 0) {
    	System.out.println("nao primo");
	    }else if(a[i]%3 == 0) {
    	System.out.println("nao primo");
	    }else if(a[i]%7 == 0) {
    	System.out.println("nao primo");
	    }else if(a[i] == 1) {
    	System.out.println("nao primo");
	    }else if(a[i] == 1) {
	    System.out.println("primo");
	    }else if(a [i]%2 == 0) {
	    System.out.println("nao primo");
        }else
        	 System.out.println("primo");
      }sett.close();
	}
}
