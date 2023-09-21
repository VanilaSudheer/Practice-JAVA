import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZigZagArray {
    int[] arr = {1,2,3,4,5,6,7};
    public void result(){
        Arrays.sort(arr);
        int n = arr.length;

        //set mid to highest
        int mid = n/2;
        int temp = arr[n-1];
        arr[n-1] = arr[mid];
        arr[mid] = temp;

        //swap second half mid+1 to n-2 till start = end
        int st = mid+1;
        int ed = n-2;
        while(st<ed){
            temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
