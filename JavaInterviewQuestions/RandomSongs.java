package helloworld;
import java.lang.*;

public class RandomSongs {

	static void random(int a[], int l) {
		 if(l == 0 ) { System.out.println("Playing song " + a[0]);}
		 else {
		    int randomSongNo = (int) Math.floor(l * Math.random());
		    System.out.println("Playing song " + a[randomSongNo]);
		    //move song to the end
		    int swap = a[randomSongNo];
		    a[randomSongNo] = a[l];
		    a[l] = swap;
		    random(a,l-1);
		 }
		    
	}
	
	public static void main(String args[]) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		random(a,9);
	}
}
