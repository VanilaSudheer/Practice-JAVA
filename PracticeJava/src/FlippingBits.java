public class FlippingBits {
    long original = 2147483647;
    public void result(){
        long flippedBits = ~original & 0xFFFFFFFFL;
        System.out.println(original);
        System.out.println(flippedBits);

    }

}
