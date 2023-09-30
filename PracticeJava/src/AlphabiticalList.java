import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlphabiticalList {
    List<String> grid1 = Arrays.asList("zbacd", "fghij", "olmkn", "trpqs", "xywuv");
    List<String> grid = Arrays.asList("abc", "ade", "efg");
    List<String> sortedGrid = grid.stream()
            .sorted()
            .collect(Collectors.toList());
    /***

     boolean isAlphabetical = IntStream.range(0, grid.get(0).length())
     .allMatch(col -> IntStream.range(1, grid.size())
     .allMatch(row -> sortedGrid.get(row).charAt(col) >= sortedGrid.get(row - 1).charAt(col)));
     **/

    public void result(){
        System.out.println(grid);
        System.out.println(sortedGrid);
        int m = sortedGrid.size();
        int n = sortedGrid.get(0).length();
        boolean toContinue = true;
        int i = 0;
        while (toContinue && i<n){
            for (int j = 1; j<m;j++){
                if(sortedGrid.get(j).charAt(i)<sortedGrid.get(j-1).charAt(i)){
                    System.out.println("not AlphabeticalColumn");
                    toContinue = false;
                    break;
                }
            }
            i++;

        }
        if(toContinue) System.out.println("alphabetical");

    }




}
