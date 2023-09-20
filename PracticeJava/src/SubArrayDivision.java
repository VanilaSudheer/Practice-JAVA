import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubArrayDivision {
    List<Integer> s = Arrays.asList(2,2,1,3,2);
    //size of sub array is m
    int m = 2;
    //sum of all elements in sub array is d
    int d = 4;

    public void result(){
        List<List<Integer>> output = new ArrayList<>();
        int sum = 0;

        int n = s.size();
        for(int i=0 ; i <= n-m ; i++){
            List<Integer> subArr = new ArrayList<>(s.subList(i,i+m));

            sum = subArr.stream().mapToInt(Integer::intValue).sum();
            if(sum == d ){
                output.add(subArr);
            }
        }
        System.out.println(output);

    }




}
