import java.util.Arrays;
import java.util.List;

public class SymmetricByWeight {
    List<Integer> arr = Arrays.asList(2,0,0,0);
    int n = arr.size();
    int total = arr.stream().mapToInt(Integer::intValue).sum();
    public void result(){
        if(n==0 || n==1) System.out.println("Yes");

        int left = 0;
        int right = total-arr.get(0);
        if(left == right) System.out.println("Yes");

        for (int i = 1 ; i<n-1 ;i++){
            right -= arr.get(i) ;
            left += arr.get(i-1);
            if(left == right) System.out.println("Yes");
            else if(right < left) System.out.println("No");
        }


    }



}
