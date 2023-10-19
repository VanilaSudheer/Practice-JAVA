import java.util.*;

public class DenseRanking {
    public void result(){
        List<Integer> ranked = Arrays.asList(100,90,90,80);
        List<Integer> player = Arrays.asList(70,80,105);
        Set<Integer> rankedSet = new HashSet<>(ranked);
        List<Integer> rankedUnique = new ArrayList<>(rankedSet);
        Collections.sort(rankedUnique,Collections.reverseOrder());
        System.out.println(rankedUnique.toString());
        List<Integer> result = new ArrayList<>();
        for(int game : player){

            int n = rankedUnique.size();
            int left = 0;
            int right = n-1;
            int mid;
            int rank = 0;
            while(left <= right){
                mid = (left+right)/2;
                int curr = rankedUnique.get(mid);
                if(curr == game){
                    rank = mid+1;
                    break;
                }else if (curr > game) {
                    rank = mid+2;
                    left = mid+1;

                }else{
                    rank = mid+1;
                    right = mid-1;
                }
            }
            if(rank == 0)rank = 1;
            result.add(rank);
            System.out.println(rank);

        }
        System.out.println(result.toString());

    }

}
