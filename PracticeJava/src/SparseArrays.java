import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays {
    List<String> strings = Arrays.asList("ab","bd","ab","xyz","rst","ab","xyz");
    List<String> queries = Arrays.asList("xyz","rst","ab");
    int n = strings.size();
    int q = queries.size();
    List<Integer> counts = new ArrayList<>(q);

    public void result(){
        String currQuery;
        int currCount ;

        for(int i = 0 ; i<q ; i++){
            currQuery = queries.get(i);
            currCount = 0;
            for(int j=0 ; j<n ; j++){
                if(currQuery.equals(strings.get(j)))currCount++;
            }
            counts.add(i,currCount);
        }
        System.out.println(strings);
        System.out.println(queries);
        System.out.println(counts);
    }

}
