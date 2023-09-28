import java.util.*;

public class LCMandGCD {
    List<Integer> arr1 = Arrays.asList(2,4);
    List<Integer> arr2 = Arrays.asList(16,32,96);
    public int findGCD(int a,int b){
        if(b==0)return a;
        return findGCD(b,a%b);
    }
    public int findGCDofList(List<Integer> arr){
        int gcd = arr.get(0);
        for(int i = 1; i < arr.size() ; i++){
            gcd = findGCD(gcd, arr.get(i));
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
    public  int findLCM(int a,int b){
        return a * b / findGCD(a,b);
    }
    public int findLCMofList(List<Integer> arr){
        int lcm = arr.get(0);
        for(int num : arr ){
            lcm = findLCM(lcm,num);
        }
        return lcm;
    }

    public void result(){
        System.out.println("LCMand GCD");
        int gcd2 = findGCDofList(arr2);
        //int gcd1 = findGCDofList(arr1);
        int lcm1 = findLCMofList(arr1);

        System.out.println("largest of "+ arr1+" is : "+lcm1);
        System.out.println("gcd of "+ arr2+" is : "+gcd2);
        Set<Integer> set1 = new HashSet<>();
        for(int i=1 ; lcm1*i<= gcd2;i++){

            set1.add(lcm1*i);

        }
        Set<Integer> divisorSet = allDivisors(gcd2);

        System.out.println("multiples of " + lcm1 + " less than or equal to "+ gcd2 + " are "+set1);
        System.out.println("all Divisors of "+ gcd2 + " are "+ divisorSet);
        Set<Integer> union = new HashSet<>(divisorSet);
        union.retainAll(set1);
        System.out.println("union of "+ divisorSet +" and "+set1+" is "+union);
        System.out.println(union.size());


    }
    public void result2(){
        int gcd = arr2.get(0);
        for (int num : arr2){
            gcd = findGCD(gcd,num);
            }
        System.out.println("gcd of  "+arr2+" is "+gcd);
        Set<Integer> divisorSet = allDivisors(gcd);
        System.out.println("all Divisors of "+ gcd + " are" +divisorSet);
        Set<Integer> unionSet = new HashSet<>(arr1);
        unionSet.retainAll(divisorSet);


        System.out.println("result is "+ unionSet.size());


    }
}
