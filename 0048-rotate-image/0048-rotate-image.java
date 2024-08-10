// inter change the top and bottom row
// swap the columns
class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //Interchange the top and bottom row
        for(int i=0;i<row/2;i++){
            for(int j=0;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[row-1-i][j];
                matrix[row-1-i][j]=temp;
            }
        }
        //swap the diagonal columns
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}