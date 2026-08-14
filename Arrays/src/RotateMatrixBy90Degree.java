import java.util.Arrays;

public class RotateMatrixBy90Degree {
    public void solution(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        //Reverse
        for(int i=0;i<matrix.length;i++){
            int n=matrix[i].length-1;
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j];
                matrix[i][n-j]=temp;

            }
        }

        //swap
        int row= matrix.length-1;
        int col=matrix[0].length-1;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[i].length-i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[row-j][col-i];
                matrix[row-j][col-i]=temp;
            }




        }
        System.out.println("After Rotating: ");
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
