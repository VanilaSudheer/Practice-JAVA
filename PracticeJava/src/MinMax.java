import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MinMax {
    List<Integer> list = Arrays.asList(1,2,5,6,3,4,8,21,11,4);
    long min = 0;
    long max = 0;
    int size = list.size()-1;
    public void result(){
        Collections.sort(list);
        for(int i =0 ; i<4 ; i++){
            min += list.get(i);
            max += list.get(size-i);
        }
        System.out.println(list);
        System.out.println("Minimum sum " + min + " Maximum sum " + max );
    }
}
