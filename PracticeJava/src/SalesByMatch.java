import java.util.*;

public class SalesByMatch {
    public int findMatch(int n,List<Integer> ar){
        int res = 0;
        int count = 1;
        int curr,pre = ar.get(0);
        Collections.sort(ar);
        for(int i=1 ;i<n ; i++){
            curr = ar.get(i);
            if (curr==pre)count++;
            else {
                res += (count/2);
                count = 1;
            }
            pre = curr;
        }
        res += count/2;

        return res;
    }
    public int freqMatch(int n, List<Integer> ar){
        int res = 0;
        Map<Integer,Integer> freqMap = new HashMap<>();
        for (int color :ar){
            freqMap.put(color,freqMap.getOrDefault(color,0)+1);
        }
        for (int count : freqMap.values()){
            res += count/2;
        }
        return res;
    }
    public void result(){
        List<Integer> ar = Arrays.asList(1,1,3,1,2,1,3,3,3,3);
        int n = ar.size();
        System.out.println(findMatch(n,ar));
        System.out.println(freqMatch(n,ar));

    }
}
