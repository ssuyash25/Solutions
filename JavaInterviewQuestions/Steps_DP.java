package helloworld;
import java.util.*;

public class Steps_DP {
	int ways(int n){
	    if(n < 0) return 0;

	    if(n == 0) return 1;

	    return ways(n-1) + ways(n-2) + ways(n-3);

	}
	
	int dp(int n, int a[]){
	     if(n < 0) return 0;
	     if(n == 0) return 1;
	     if(a[n] != 0) return a[n];
	     a [n] = dp(n-1, a) + dp(n-2, a) + dp(n-3, a);
	     return a[n];
	}
	
	public static void main(String args[]) {
        Steps_DP ob = new Steps_DP();
        int result = ob.ways(4);
        System.out.println("No. of ways to reach "+ 4 + "are :" + result);
        int resultDP = ob.dp(4, new int[5]);
        System.out.println("No. of ways to reach "+ 4 + "are :" + resultDP);
	}
}
