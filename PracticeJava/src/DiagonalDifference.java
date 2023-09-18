import java.util.Arrays;
import java.util.List;

import static java.lang.Math.abs;

public class DiagonalDifference {
    List<List<Integer>> matrix = Arrays.asList(
            (Arrays.asList(1,2,3)),
            (Arrays.asList(4,5,6)),
            (Arrays.asList(7,8,1))
    );
    public void result(){
        int n = matrix.size()-1;
        int rightDiagonal = 0, leftDiagonal = 0;
        for (int i=0; i<=n; i++){
            rightDiagonal += matrix.get(i).get(i);
            leftDiagonal += matrix.get(i).get(n-i);
        }
        int difference = abs(rightDiagonal-leftDiagonal);
        System.out.println(difference);
    }

}
