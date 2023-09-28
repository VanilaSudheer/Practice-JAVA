import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anagram {
    String s = "xabcdefhabcdefgy";
    public void result(){
        int n = s.length();
        int res =0;
        String left = s.substring(0,n/2);
        String right = s.substring(n/2);
        if(left.length() != right.length()) System.out.println("No match");
        else{
            Set<Character> leftSet = new HashSet<>();
            Set<Character> rightSet = new HashSet<>();


            for(char ch :left.toCharArray()){
                leftSet.add(ch);

            }
            for(char ch :right.toCharArray()){
                rightSet.add(ch);

            }
            Set<Character> unionSet = new HashSet<>(leftSet);
            unionSet.retainAll(rightSet);
            int union = unionSet.size();
            res = n/2 - union;
            System.out.println(res+"***2****");


        }
    }

}
