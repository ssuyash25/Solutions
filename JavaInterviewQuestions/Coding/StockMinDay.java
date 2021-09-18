package helloworld;
import java.util.*;


// Initial n
// Final m
// How many minimum no. of days will it take for n to become m
// Rule : 1) reduce by 1 2) double
// 1 -> 2 -> 4 -> 8 -> 7 -> 6 -> 5 -> 10 

public class StockMinDay {
	
	static int minimumDays(int n, int m) {
		
		int dp[] = new int [m+1];
		dp[0] = 0;
		
		for(int i = 1; i<= m ; i++) {
			int min = i/2 > 0 ? dp[i/2] : Integer.MAX_VALUE;
			int dob = i-1 > -1 ? dp[i-1] : Integer.MAX_VALUE;
			dp[i] = Math.min( min, dob) + 1;
		}
		
		for(int j : dp){
		System.out.println(j);	

		}
		
		return dp[m];
	}
	
	public static void main(String args[]) {
		System.out.println(minimumDays(1,10));	
	}
	
}
