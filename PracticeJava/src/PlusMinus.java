import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    List<Integer>  list = Arrays.asList(1,3,2,0,-8,-6,9,0,9);
    public void result(){
        int size = list.size();
        int positives = 0, negatives = 0, zeroes = 0;
        for (int n : list){
            if(n>0)positives++;
            else if (n<0) negatives++;
            else zeroes++;
        }
        System.out.printf("%.6f\n%.6f\n%.6f\n",(double)positives/size,(double)negatives/size,(double)zeroes/size);
    }

}
