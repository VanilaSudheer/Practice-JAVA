import java.util.*;

public class FireWorks {

    public List<String> newGrid(int r, int c, char val) {
        List<String> grid = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            String row = "";
            for (int j = 0; j < c; j++) {
                row += val;
            }
            grid.add(row);
        }
        return grid;

    }

    public void printGrid(List<String> grid) {
        for (String row : grid) {
            for (char ele : row.toCharArray()) {
                System.out.printf("%-4s", ele);
            }
            System.out.println();
        }
        System.out.println("**************");
    }
    public List<String> nextGrid(List<String> grid){
        List<String> nextG = new ArrayList<>();

        Set<int[]> chain = new HashSet<>() ;
        int m = grid.size();
        int n = grid.get(0).length();
        for(int i = 0;i<m;i++){
            String str ="";
            String s = grid.get(i);
            for(int j =0;j<n;j++) {
                if (s.charAt(j) == 'o') {
                    str += '.';
                    int[] top = {i + 1, j};
                    int[] bot = {i - 1, j};
                    int[] left = {i, j - 1};
                    int[] right = {i, j + 1};
                    chain.add(top);
                    chain.add(bot);
                    chain.add(left);
                    chain.add(right);


                }else{
                    str += 'o';
                }
            }
            nextG.add(str);
        }
        for(int[] st : chain) {

            int ith = st[0];
            int jth = st[1];
            if (ith >= 0 && ith < m && jth >= 0 && jth < n) {
                System.out.println(ith+"]["+jth);
                String str = nextG.get(ith);
                String string = str.substring(0,jth)+'.'+str.substring(jth+1);
                nextG.set(ith,string);
            }
        }



        return nextG;
    }
/**
    public void printMatrix(List<List<Integer>> matrix) {
        char ch;
        for (List<Integer> row : matrix) {
            for (int ele : row) {
                if (ele < 0) ch = '.';
                else ch = 'o';
                System.out.printf("%-4s", ele);
            }
            System.out.println();
        }
        System.out.println("********************");
    }
    public boolean areListEqual(List<List<Integer>> list1,List<List<Integer>> list2){
        if (list1.size() != list2.size()) {
            return false;
        }

        for (int i = 0; i < list1.size(); i++) {
            List<Integer> row1 = list1.get(i);
            List<Integer> row2 = list2.get(i);

            if (!row1.equals(row2)) {
                return false;
            }
        }
        return true;
    }
 **/

    public void result() {
        int m = 6;
        int n = 7;
        List<String> startGrid = newGrid(m, n, '.');
        //grid[1][1] = 'o'
        startGrid.set(1, "...o...");
        startGrid.set(2, "....o..");
        //startGrid.set(0, ".......");
        //startGrid.set(3, ".......");
        startGrid.set(4, "oo.....");
        startGrid.set(5, "oo.....");

        printGrid(startGrid);
        List<String> res =new ArrayList<>();


        List<String> twoSecGrid = newGrid(m, n, '0');
        int sec = 9;
        /**
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            matrix.add(row);
            String r = startGrid.get(i);
            for (int j = 0; j < n; j++) {
                if (r.charAt(j) == 'o') matrix.get(i).add(0);
                else matrix.get(i).add(2);
            }

        }

        List<List<Integer>>  startMatrix= new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> newR =new ArrayList<>();
            startMatrix.add(newR);
            for(Integer ele : matrix.get(i)){
                startMatrix.get(i).add(ele);
            }
        }
         **/

        if (sec == 0 || sec == 1) {
            System.out.println("after " + sec + " seconds");
           printGrid(startGrid);
        } else if (sec % 2 == 0) {
            System.out.println("after " + sec + " seconds");
            printGrid(twoSecGrid);
        } else if (sec % 4 == 3){
            res = nextGrid(startGrid);
            printGrid(res);
        }
        else{
            res = nextGrid(nextGrid(startGrid));
            printGrid(res);
        }

        /**

        {
            int count;
            Stack<int[]> stack = new Stack<>();

            for (int k = 3 ; k <= sec ; k++) {
                printMatrix(matrix);
                for (int i = 0; i < m; i++) {
                    //List<Integer> row = matrix.get(i);
                    for (int j = 0; j < n; j++) {
                        count = matrix.get(i).get(j);
                        //System.out.println("current"+count);
                        count--;
                        matrix.get(i).set(j, count);
                        //System.out.println("set"+i+","+j+"to"+matrix.get(i).get(j));
                        if (count == -1) {
                            int[] top = {i + 1, j};
                            int[] bot = {i - 1, j};
                            int[] left = {i, j - 1};
                            int[] right = {i, j + 1};

                            stack.push(top);
                            stack.push(bot);
                            stack.push(left);
                            stack.push(right);
                        }
                        if ((k % 2 == 0) && count < 0) {
                            matrix.get(i).set(j, 2);


                        }
                    }

                }
                while (!stack.isEmpty()) {
                    int[] st = stack.pop();
                    int ith = st[0];
                    int jth = st[1];
                    if (ith >= 0 && ith < m && jth >= 0 && jth < n) {
                        if (k % 2 == 0) {
                            matrix.get(ith).set(jth, 2);
                        } else {
                            matrix.get(ith).set(jth, -1);
                        }
                    }
                }
            }


        }
         **/

    }
}
