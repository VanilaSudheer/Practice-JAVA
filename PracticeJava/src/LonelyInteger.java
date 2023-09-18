import java.util.*;

public class LonelyInteger {
    List<Integer> arr = new ArrayList<>(Arrays.asList(6,5,1,2,3,4,3,2,1,4,5));
    int n = arr.size();

    public void result(){
        int currInt;
        int m ;
        int i=0;
        boolean duplicate;
        do{
            System.out.println(arr);
            m= arr.size();
            duplicate = false;
            currInt = arr.get(0);
            for(int j=1 ; j< m ;j++){
                if(currInt == arr.get(j)) {
                    duplicate = true;
                    arr.remove(j);
                    arr.remove(0);
                    break;

                }
            }
            i++;

        }while (duplicate && i<n/2);
        System.out.println(arr.get(0));


    }
    public void result2(){
        Map<Integer,Integer> freqencyMap = new HashMap<>();
        for (Integer num : arr){
            freqencyMap.put(num,freqencyMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freqencyMap.entrySet()){
            if(entry.getValue() == 1 ){
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
