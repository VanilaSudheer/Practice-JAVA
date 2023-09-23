import java.util.*;

public class MinimumUnfairness {
    List<Integer> arr = Arrays.asList(1,2,3,4,10,20,30,40,100,200);
    int k = 4;
    int n = arr.size();
    public void result(){
        Collections.sort(arr);
        int minFairness = Integer.MAX_VALUE;
        int fairness;
        int index = 0;

        for(int i = 0 ; i <= n-k ; i++ ){
            fairness = arr.get(i+k-1) - arr.get(i);
            if (fairness < minFairness){
                minFairness = fairness;
                index = i;
            }
        }
        System.out.println(arr.subList(index,index+k));
        System.out.println(minFairness);
    }

    public void result1(){
        Collections.sort(arr);
        List<Integer> diffArr = new ArrayList<>();

        int diff;
        Map<Integer,Integer> diffMap = new HashMap<>();

        for(int i = 0 ; i < n-k ; i++ ){
            diff = arr.get(i+k-1) - arr.get(i);
            diffArr.add(diff);
            diffMap.put(i,diff);
        }
        Collections.sort(diffArr);
        int minDiff = diffArr.get(0);
        int resI = 0;

        for(Map.Entry <Integer,Integer> entry : diffMap.entrySet()){
            if(entry.getValue() == minDiff) resI = entry.getKey();
        }
        List<Integer> resList = arr.subList(resI,resI+k);
        System.out.println(resList);
        int maxUnfairness = resList.get(resI+k) - resList.get(resI);
    }

}
