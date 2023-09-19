import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    List<Integer> A = Arrays.asList(2,1,3);
    List<Integer> B = Arrays.asList(7,8,9);
    int k = 10;
    public void result(){
        boolean permute = true;
        int n = A.size();
        int j = n;
        Collections.sort(A);
        Collections.sort(B);

        for(int i=0; i<n; i++){
                j -= 1;
                if(A.get(i)+B.get(j) >= k)continue;
                else{
                    System.out.println("No");
                    permute = false;
                    break;
                }
            }
        if (permute){
            System.out.println("yes");
        }

        }


}
