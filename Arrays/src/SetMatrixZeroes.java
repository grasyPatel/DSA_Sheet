import java.util.Arrays;

public class SetMatrixZeroes {
    public void solution(int [][]matrix){
        System.out.println("original: ");
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
         int []row=new int [matrix.length];
         int col[]=new int [matrix[0].length];

         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==0){
                     row[i]=1;
                     col[j]=1;
                 }

             }
         }
        System.out.println(Arrays.toString(col));
        System.out.println(Arrays.toString(row));
         for (int i=0;i<matrix.length;i++){
             for(int j=0;j< matrix[0].length;j++){
                 if(row[i]==1 ||col[j]==1){
                     matrix[i][j]=0;

                 }
             }




         }
         System.out.println("Modified: ");
         for(int i=0;i<matrix.length;i++){
             System.out.println(Arrays.toString(matrix[i]));
         }
    }
}
