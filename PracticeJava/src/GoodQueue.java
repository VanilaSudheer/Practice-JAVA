import java.util.Arrays;
import java.util.List;

public class GoodQueue {
    public void result1(){
        List<Integer> q = Arrays.asList(1,2,5,3,7,8,6,4);
        //List<Integer> q = Arrays.asList(1,2,3,6,4,5,7);
        //List<Integer> q = Arrays.asList(1,2,3,7,6,5,4);
        int n = q.size();
        int bribes = 0;
        int shift,num,start;
        for (int i=0;i<n;i++){
            num = q.get(i);
            shift = num-i-1;
            if(shift>2){
                System.out.println("chaotic");
                break;
            }
            start= Math.max(0,num-1);
            for (int j = start;j<i;j++){
                if(q.get(j)>q.get(i)){
                    bribes++;
                    System.out.println(bribes);
                }
            }


        }
        System.out.println(bribes);

    }
    public void result(){
        List<Integer> q = Arrays.asList(1,2,5,3,7,8,6,4);
        int n = q.size();
        int shift,num,total = 0 ;
        for (int i=0;i<n;i++){
            num = q.get(i);
            shift = num-i-1;
            if(shift>2){
                System.out.println("Too chaotic");
                break;
            }
            total += Math.abs(shift);
            System.out.println(total);

        }
        System.out.println(total/2);

    }

}
