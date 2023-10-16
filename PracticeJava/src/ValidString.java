import java.util.*;

public class ValidString {
    public void result(){
        String s = "abccdde";
        Map<Character,Integer> dict = new HashMap<>();
        for (char ch : s.toCharArray()) {
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);
        }
        System.out.println(dict.toString());
        Set<Integer> counts = new HashSet<>(dict.values());
        int letterCounts = counts.size();
        System.out.println(counts.toString());
        // all char appears same number of times
        if(letterCounts == 1) System.out.println("*valid String");
        // two diifferent counts are there
        else if(letterCounts == 2) {
            List<Integer> conuntList = new ArrayList<>(counts);
            int f1 = conuntList.get(0);
            int f2 = conuntList.get(1);
            int diff = Math.abs(f1-f2);
            /**
            Iterator<Integer> iterator = counts.iterator();
            int firstCount = iterator.next();
            int secondCount = iterator.next();

            int difference = Math.abs(firstCount - secondCount);
             **/

            // n different characters each appear f1 or f2 freq
            int n = dict.keySet().size();
            // l total characters
            int l = s.length();
            System.out.println("total "+ l+" of "+n + " diff characters each appear "+f1+ " or "+f2);
            if(diff== 1 &&( ( l == (n*f1) + 1 || l == (n*f2)+ 1 ))) {
                System.out.println("**valid String");
            }
            if(f1==1&&(l == ((n-1)*f2)+1)  || f2==1&&(l==(n-1)*f1+1)){
                System.out.println("***valid String");
            }else{
                System.out.println("*Not valid String");
            }

        }else{
            System.out.println("**Not valid String");
        }
    }
}
