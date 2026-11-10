class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowL = 0;
        int rowR = matrix.length-1;
        int rowM = (rowL+rowR)/2;
        int colL = 0;
        int colR = matrix[rowM].length-1;
        int colM = (colL+colR)/2;
        while(colL<=colR&&rowL<=rowR&&matrix[rowM][colM]!=target)
        {
            if(matrix[rowM][matrix[rowM].length-1]<target)
            {
                rowL = rowM+1;
                rowM = (rowL+rowR)/2;
                continue;
            }
            else if(matrix[rowM][0]>target)
            {
                rowR = rowM-1;
                rowM = (rowL+rowR)/2;
                continue;
            }
            
            if(matrix[rowM][colM]<target)
            {
                colL = colM+1;
            }
            else
            {
                colR = colM-1;
            }
            colM = (colL+colR)/2;
        }
        if(!(colL<=colR&&rowL<=rowR))
            return false;
        return true;
    }
}
