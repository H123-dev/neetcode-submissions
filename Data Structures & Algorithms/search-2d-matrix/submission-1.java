class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int colL = 0;
        int colR = matrix[row].length-1;
        int colM = (colL+colR)/2;
        while(colL<=colR&&row<matrix.length&&matrix[row][colM]!=target)
        {
            if(matrix[row][matrix[row].length-1]<target)
            {
                row++;
                continue;
            }
            
            if(matrix[row][colM]<target)
            {
                colL = colM+1;
            }
            else
            {
                colR = colM-1;
            }
            colM = (colL+colR)/2;
        }
        if(row>=matrix.length||colL>colR)
            return false;
        return true;
    }
}
