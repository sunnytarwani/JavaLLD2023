
package Projects.TicTacToe.Strategies;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;
import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Character, Integer> leftMap = new HashMap<>();
    private Map<Character, Integer> rightMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        char symbol = move.getPlayer().getSymbol();
        int boardDimension = board.getDimension();

        // Check the left diagonal (top-left to bottom-right)
        if (row == col) {
            if(!leftMap.containsKey(symbol)){
                leftMap.put(symbol , 0);
            }
           leftMap.put(symbol , leftMap.get(symbol) + 1);
            if (leftMap.get(symbol) == boardDimension) {
                return true;
            }
        }

        // Check the right diagonal (top-right to bottom-left)
        if (row + col == boardDimension - 1) {
            if(!rightMap.containsKey(symbol)){
               rightMap.put(symbol , 0);
            }
            rightMap.put(symbol ,rightMap.get(symbol) + 1);
            if (rightMap.get(symbol) == boardDimension) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getColumn();
        char symbol = lastMove.getPlayer().getSymbol();

        if(row == col){
            leftMap.put(symbol , leftMap.get(symbol) - 1);
        }
        else if(row + col == board.getDimension()-1) {
            rightMap.put(symbol , rightMap.get(symbol) -1);
        }
    }
}
