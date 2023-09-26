public class LuckyNumber {
    String n = "148";
    public String sumOfDigits(String n){
        int d,sum = 0;
        if(n.length() == 1) return n;
        for(char ch : n.toCharArray()){
            d =Character.getNumericValue(ch);
            sum += d;
        }
        n = Integer.toString(sum);
        return sumOfDigits(n);
    }
    public void result(){
        String superDigit = sumOfDigits(n);
        System.out.println(superDigit);


    }
}
