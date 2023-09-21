import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlippingMatrix {
    List<List<Integer>> matrix =new ArrayList<>();
    public  void randomMatrix (int m,int n){
        Random random =new Random();

        for (int i=0; i<m; i++){
            matrix.add(new ArrayList<>());
            for (int j=0; j<n; j++){
                int randomValue = random.nextInt(25);
                matrix.get(i).add(randomValue);
            }

        }

    }
    public void printMatrix(){
        for(List<Integer> row: matrix){

            for (int ele : row){
                System.out.printf("%-4s",ele);
            }
            System.out.println();

        }
    }
    public void flipRow(int r){
        List<Integer> row = new ArrayList<>(matrix.get(r));
        int n = row.size();
        for (int i = 0; i <n/2; i++ ){
            int temp = row.get(i);
            row.set(i,row.get(n-i-1));
            row.set(n-i-1,temp);
        }
        matrix.set(r,row);

    }
    public void flipCol(int c){
        List<Integer> col = new ArrayList<>();
        for (List<Integer> row : matrix){
            col.add(row.get(c));
        }
        int j=matrix.size()-1;
        for(int ele :col){
            matrix.get(j--).set(c,ele);
        }

    }
    public boolean needFlipRow(int r, int s){
        int sumLeft = 0, sumRight = 0;
        List<Integer> row = matrix.get(r);
        int n = row.size();
        for(int i=0;i<s;i++){
            sumLeft += row.get(i);
            sumRight += row.get(n-i-1);
        }
        return (sumLeft < sumRight);
    }
    public boolean needFlipCol(int c,int s){
        int sumTop = 0, sumBot = 0;
        int m = matrix.size();
        for(int i=0;i<s;i++){
            sumTop += matrix.get(i).get(c);
            sumBot += matrix.get(m-i-1).get(c);
        }
        return (sumTop<sumBot);

    }
    public int sumInnerMatrix(int iStart,int iEnd,int jStart,int jEnd){
        int sum = 0;
        for (int i=iStart;i<iEnd;i++){
            for(int j=jStart;j<jEnd;j++){
                sum += matrix.get(i).get(j);
            }
        }
        return sum;
    }



    public void result(){
        //original matrix mXn
        int n=5, m=5;
        //top left inner matrix pXp
        int p=2;
        int many=2;

        randomMatrix(m,n);
        System.out.println("****************");
        printMatrix();


        do{
            System.out.println("****************");
            int topLeft = sumInnerMatrix(0,p,0,p) ;
            int topRight = sumInnerMatrix(0,p,n-p,n);
            int botLeft = sumInnerMatrix(n-p,n,0,p);
            int botright = sumInnerMatrix(n-p,n,n-p,n);
            System.out.println(topLeft+"tl");
            System.out.println(topRight+"tr");
            System.out.println(botLeft+"bl");
            System.out.println(botright+"br");
            for(int i=0;i<m;i++){
                if(needFlipRow(i,p))flipRow(i);
            }

            for(int j=0;j<n;j++){
                if(needFlipCol(j,p)){
                    flipCol(j);
                }
            }


            many--;
        }while (many!=0);




        System.out.println("****************");
        printMatrix();
    }
}
