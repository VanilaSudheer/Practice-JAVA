import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    String s = "The quick brown fox jumps over the lazy dog";
    String str = s.replaceAll("\\s","");
    public void result(){
        Set<Character> alphabets = new HashSet<>();
        for(char x : str.toCharArray()){
            if(alphabets.contains(x))continue;
            else alphabets.add(x);
        }
        if(alphabets.size()==26){
            System.out.println("Pangram");
        }else{
            System.out.println("Not Panagram");
        }

    }
    public void result2(){
        boolean[] alphabet = new boolean[26];
        boolean panagram = true;
        for(char x : str.toCharArray()){
            alphabet[Character.toLowerCase(x)-'a'] = true;

        }
        int i =0;
        for(boolean f : alphabet){
            if(!f){
                System.out.println("Not Panagram");
                panagram = false;
            }
        }
        if(panagram){
            System.out.println("Pangram");
        }
    }
}
