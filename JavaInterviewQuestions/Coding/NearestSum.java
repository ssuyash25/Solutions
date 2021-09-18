import java.util.*;

public class NearestSum {

    static void closest(int a[], int b[]) {
        int s[] = new int[16];
        s = sum(a, b);
        Arrays.sort(s);
        for (int j = 0; j < s.length; j++) {
            System.out.println(s[j]);
        }
        boolean flag = true;
        int n = 0;
        while (flag) {
            for (int j = 0; j < s.length; j++) {
                if (n == s[j]) {

                }
            }
        }
    }

    static int[] sum(int a[], int b[]) {
        int s[] = new int[16];
        // for(let j=0; j<a.length; j++){
        //  s[j] = new Array(b.length)}
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                s[k++] = a[i] + b[j];
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 6, 2};
        int b[] = {5, 6, 2, 4};
        closest(a, b);
    }
}
