import java.util.*;

public class LonelyInteger {
    List<Integer> arr = new ArrayList<>(Arrays.asList(6,5,1,2,3,4,3,2,1,4,5));
    int n = arr.size();


    public void result(){
        int unique = 0;
        for (int num : arr){
            unique ^= num;
        }
        System.out.println(unique);
    }
}
