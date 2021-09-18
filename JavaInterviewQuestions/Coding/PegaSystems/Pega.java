package PegaSystems;//String s = "Thisisaflower"
//        dictionary
//        ----------
//        This
//        is
//        a
//        an
//        flow
//        flower
//
//        longest 6;
//        "ThisisaflowerThis"
//        i
//        j
//        this is a flower
//        er
//        flow + er = flower

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class WorkBreak{

         static boolean isValid(String s, List<String> al) {
                return wordBreakRecur(s, new HashSet<String>(al), 0);
        }

        private static boolean wordBreakRecur(@NotNull String s, HashSet<String> dics, int start) {
                if(start == s.length())
                        return true;

                for(int end= start+1; end <=s.length(); end++){
                        if(dics.contains(s.substring(start, end)) &&
                                wordBreakRecur(s, dics, end))
                                return true;
                }

                return false;
        }

        public static void main(String args[]){
                List<String> al = new ArrayList<>();
                al.add("This");
                al.add("is");
                al.add("a");
                al.add("an");
                al.add("flow");
                al.add("flower");
                System.out.println( isValid("ThisisaflowerThis", al) );
        }
}