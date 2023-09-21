public class BookPages {
    int n  = 100;
    int p = 70;
    int fromLeft = p/2;
    int fromRight = (n-p)/2 ;
    public void result(){
        if( n % 2 == 0){
            fromRight = (n-p+1)/2;
        }
        System.out.println(Math.min(fromLeft,fromRight));
    }



}
