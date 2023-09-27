public class Palindrom {
    String s = "abcdedcxyba";

    public int isPalindrom(String str){
        int n =str.length();
        for(int i=0;i<=n/2;i++) {
            if (str.charAt(i) == str.charAt(n - 1-i)) continue;
            else return i;
        }
        return -1;
    }
    public void result(){
        int idx = isPalindrom(s);
        int l = s.length();
        if(idx == -1) System.out.println("Palindrom");
        else{
            String temp1 = s.substring(0,idx) + s.substring(idx+1);
            if(isPalindrom(temp1) == -1) System.out.println(idx);
            else {
                String temp2 = s.substring(0,l-1-idx) + s.substring(l-idx);
                if(isPalindrom(temp2) == -1) System.out.println(l-idx-1);
                else System.out.println("Not Palindrom");
            }

        }


    }

}
