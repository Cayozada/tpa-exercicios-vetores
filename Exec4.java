import java.lang.Math;
public class Exec4 {
	
	public static void main(String[] args) {
		double pot;
		final int N = 11;
	    
		int i, a[];
	    a = new int [N];
	    for (i = 0; i<=10; i++) {
		    a[i] = 2;
		    a[1] = 2;
		    a[2] = 2;
		    a[3] = 2;
		    a[4] = 2;
		    a[5] = 2;
		    a[6] = 2;
		    a[7] = 2;
		    a[8] = 2;
		    a[9] = 2;
		    a[10] = 2;
	    	pot = Math.pow(a[i], i);
	    	System.out.println(pot);
	    }
	    		

	}
}