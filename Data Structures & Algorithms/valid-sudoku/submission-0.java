class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> rows=new HashSet();
        HashSet<String> cols=new HashSet();
        HashSet<String> boxes=new HashSet();
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                char num=board[r][c];
                if(num=='.')
                {
                    continue;
                }
                if(!rows.add(num+"in row"+r))
                {
                    return false;
                }
                if(!cols.add(num+"in col"+c))
                {
                    return false;
                }
                int box=(r/3)* 3+(c/3);
                if(!boxes.add(num+"in box"+box))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}
