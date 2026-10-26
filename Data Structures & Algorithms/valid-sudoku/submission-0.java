class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,int []> count = new HashMap<>();
        for(int i = 0 ; i<27;i++)
        {
            int [] a = new int [10];
            count.put(i,a);
        }
        int block = 18;
        for(int i = 0 ; i<board.length;i++)
        {
            if(i==3||i==6)
                block+=3;
            int sb = block;
            int [] rowC = count.get(i);
            for(int j = 0 ; j<board[i].length;j++)
            {
                if(j==3||j==6)
                    block++;
                int [] blockC = count.get(block);
                int [] colC = count.get(j+9);
                char crrx = board[i][j];
                if(crrx=='.')
                    continue;
                int crr = crrx-'0';
                if(rowC[crr]!=0||colC[crr]!=0||blockC[crr]!=0)
                    return false;
                rowC[crr]++;
                colC[crr]++;
                blockC[crr]++;
            }
            block =sb;
        }
        return true;
    }
}
