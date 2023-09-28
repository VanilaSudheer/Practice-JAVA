import java.util.*;

public class LCMandGCD {
    List<Integer> arr1 = Arrays.asList(2,4);
    List<Integer> arr2 = Arrays.asList(24,36);
    public int findGCD(int a,int b){
        if(b==0)return a;
        return findGCD(b,a%b);
    }
    public int findGCDofList(){
        int gcd = arr2.get(0);
        for(int i = 1; i < arr2.size() ; i++){
            gcd = findGCD(gcd, arr2.get(i));
            System.out.println(arr2.get(i) + "***" + gcd);
        }
        return gcd ;
    }
    public Set<Integer> allDivisors(int a){
        Set<Integer> divisor = new HashSet<>();
        for(int i=1 ;i<=Math.sqrt(a);i++){
            if(a % i == 0){
                divisor.add(i);
                if(a/i != i){
                    divisor.add(a/i);
                }
            }
        }
        return divisor;
    }

    public void result(){
        int listGCD = findGCDofList();
        System.out.println(listGCD);
        Set<Integer> divisorList = allDivisors(listGCD);
        System.out.println(divisorList);
        Set<Integer> set1 = new HashSet<>(arr1);

        boolean res = divisorList.containsAll(set1);
        System.out.println(res);
    }
    public void result2(){
        int gcd = arr2.get(0);
        for (int num : arr2){
            gcd = findGCD(gcd,num);
            }


    }
}
