public class CaesarCipher {
    String original ="abcd efg -123- hijk to 'xyz'";
    int k = 5;
    int base;
    String output = "";
    StringBuilder res = new StringBuilder();

    public void result(){
        for (char c : original.toCharArray()){
            if(Character.isLetter(c)){
                base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c + k - base ) % 26 + base);
            }
            output += c;
            res.append(c);

        }
        System.out.println(output);
        System.out.println(res.toString());
    }
}
