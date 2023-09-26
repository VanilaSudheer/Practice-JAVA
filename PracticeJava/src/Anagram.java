import java.util.Arrays;
import java.util.List;

public class Anagram {
    String s = "abcdefhabcdefg";
    public void result(){
        int n = s.length();
        String left = s.substring(0,n/2);
        String right = s.substring(n/2);
        if(left.length() != right.length()) System.out.println("No match");
        else{
            char[] arr1 = left.toCharArray();
            char[] arr2 = right.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)) System.out.println("anagram");
            else {
                System.out.println("Not an anagram");
                for (int i =0 ;i< arr1.length;i++){
                    if(arr1[i] != arr2[i]) System.out.println(arr1[i]);
                }
            }

        }
    }

}
