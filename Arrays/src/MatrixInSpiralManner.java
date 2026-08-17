public class MatrixInSpiralManner {
    public void solution(int [][]matrix){
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right= matrix[0].length-1;
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;

            for(int i=top;i<=bottom;i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
        }
    }
}
