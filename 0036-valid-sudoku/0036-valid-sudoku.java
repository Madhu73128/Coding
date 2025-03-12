class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(String.valueOf(board[i][j]).equals("."))
                continue;
                else
                {
                    if(!seen.add(board[i][j]+" in row "+i)||!seen.add(board[i][j]+" in col "+j)||
                    !seen.add(board[i][j]+" in grid "+(i/3)+"-"+(j/3)))
                    {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}