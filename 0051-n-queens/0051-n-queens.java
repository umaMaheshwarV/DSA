class Solution {
    //write out to list
    public List<List<String>> writeAns(char[][] chessBoard, int n, List<List<String>> finalList){
        List<String> list = new ArrayList<>();
        for(char[] row:chessBoard){
            //Build a string builder and write all roe elements to list and follow on
            StringBuilder sb= new StringBuilder();
            for(char elem:row){
                sb.append(elem);
            }
            list.add(sb.toString());
        }
        finalList.add(list);
        return finalList;
    }
    //To check if placing the queen is safe here 
    public boolean isSafe(int row, int col, char[][] chessBoard,int n){
        //Check row
        int x = row;
        int y= col;
        while(y>=0){
            if(chessBoard[x][y] == 'Q') return false;
            y--;
        }
        //check upleft diagonal
        x = row;
        y= col;
        while(x>=0 && y>=0){
            if(chessBoard[x][y] == 'Q') return false;
            x--;
            y--;
        }
        //check downleft diagonal
        x = row;
        y= col;
        while(x<n && y>=0){
            if(chessBoard[x][y] == ('Q')) return false;
            x++;
            y--;
        }
        return true;
    }

    public List<List<String>> findPuzzle(int col,int n,char[][] chessBoard, List<List<String>> ans){
        if(col == n){
            writeAns(chessBoard,n,ans);
            return ans;
        }
        for(int i=0;i<n;i++){
            if(isSafe(i, col, chessBoard, n)) {
                chessBoard[i][col] = 'Q';
                findPuzzle(col+1,n,chessBoard,ans);
                chessBoard[i][col] = '.';
            }
        }
        return ans;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] chessBoard = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j] ='.';
            }
        }
        findPuzzle(0,n,chessBoard,ans);
        return ans;
    }
}
