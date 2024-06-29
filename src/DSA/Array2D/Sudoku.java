package DSA.Array2D;

public class Sudoku {
    public static void main(String[] args) {
        String [][] board =
                {{"5","3",".",".","7",".",".",".","."}
                        ,{"6",".",".","1","9","5",".",".","."}
                        ,{".","9","8",".",".",".",".","6","."}
                        ,{"8",".",".",".","6",".",".",".","3"}
                        ,{"4",".",".","8",".","3",".",".","1"}
                        ,{"7",".",".",".","2",".",".",".","6"}
                        ,{".","6",".",".",".",".","2","8","."}
                        ,{".",".",".","4","1","9",".",".","5"}
                        ,{".",".",".",".","8",".",".","7","9"}};

        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(!isCheck(i , j , board)){
                    System.out.println(false);
                }
            }
        }

        System.out.println(true);
    }

    private static boolean isCheck(int i, int j, String[][] board) {

        if(board[i][j] == "."){
            return true;
        }


        for(int num = 0 ; num < 9 ; num++){
            if(num != i && board[num][j] == board[i][j]){
                return false;
            }
            if(num != j && board[i][num] == board[i][j]){
                return false;
            }
            if(3*(i/3)+(num/3) != i && 3*(j/3)+(num%3)!=j && board[3*(i/3)+(num/3)][3*(j/3)+(num%3)] == board[i][j]){
                return false;
            }
        }
        return true;
    }
}
