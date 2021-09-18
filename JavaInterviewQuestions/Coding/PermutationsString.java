import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//Write program for printing permutations of a string.
public class PermutationsString {

    //itterative
    static List<String> permutations(String s){
        char c[] = s.toCharArray();
        HashSet<String> hs = new HashSet<>();
        for(int i=0; i< s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                char c1[] = Arrays.copyOf(c, c.length);
                c1[i] = c[j];
                c1[j] = c[i];
                hs.add(String.valueOf(c1));
            }
        }
        return hs.stream().collect(Collectors.toList());
    }

    //recursive
    static void permute(String s, int l, int r){
        if(l==r)
            System.out.println(s);
        else{
            for (int i = l; i < r; i++) {
                s = swap(s, l, i);
                permute(s, l + 1, i);
                s = swap(s, l, i);
            }
        }
    }

    static String swap(String s, int l, int r){
        char[] a= s.toCharArray();
        char c = a[l];
        a[l] = a[r];
        a[r] = c;
        return String.valueOf(a);
    }

    public static void main(String args[]) {
        List<String> al = permutations("SUYASH");
        al.forEach(s -> System.out.println(s));
        System.out.println(" This is a new way");
        permute("SUYASH",0, "SUYASH".length());
    }
}
