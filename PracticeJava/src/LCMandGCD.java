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
        }
        return gcd ;
    }
    public List<Integer> allDivisors(int a){
        List<Integer> divisors = new ArrayList<>();
        for(int i=1 ;i<=Math.sqrt(a);i++){
            if(a % i == 0){
                divisors.add(i);
                if(a/i != i){
                    divisors.add(a/i);
                }
            }
        }
        return divisors;
    }

    public void result(){
        int listGCD = findGCDofList();
        System.out.println(listGCD);
        List<Integer> divisorList = allDivisors(listGCD);
        System.out.println(divisorList);
        Set<Integer> set1 = new HashSet<>(arr1);
        Set<Integer> set2 = new HashSet<>(divisorList);
        boolean res = set2.containsAll(set1);
        System.out.println(res);


    }
}
