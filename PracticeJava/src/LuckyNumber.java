public class LuckyNumber {
    String n = "148";

    public void result(){
        int num = 0;
        for(char ch : n.toCharArray()){
            num += Character.getNumericValue(ch);
            num %= 9;
        }
        System.out.println("Lucky Number " + num);


    }
}
