import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountingSort {
    List<Integer> arr = Arrays.asList(4,16,15,22,8,4,3,8);
    public void result(){

        List<Integer> countingArr = new ArrayList<>(Collections.nCopies(25,0));
        int frequency = 90;
        for(int num :arr){
            frequency = countingArr.get(num);
            //increment frequency of num as it ppears on arr
            countingArr.set(num,frequency+1);
        }
        System.out.println(countingArr);


    }
}
