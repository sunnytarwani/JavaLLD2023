package Projects.TicTacToe.Strategies;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    Map<Integer , Map<Character , Integer>> hashMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        //int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        char symbol = move.getPlayer().getSymbol();

        //check if current row is present in hashmap

        if(!hashMap.containsKey(col)){
            hashMap.put(col , new HashMap<>());
        }

        Map<Character , Integer> colMap = hashMap.get(col);

        if(!colMap.containsKey(symbol)){
            colMap.put(symbol , 0);
        }
        colMap.put(symbol , colMap.get(symbol)+1);

        if(board.getBoard().size() == colMap.get(symbol)){
            return true;
        }
        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {
        int col = lastMove.getCell().getColumn();
        char symbol = lastMove.getPlayer().getSymbol();

        Map<Character , Integer>  colMap = hashMap.get(col);
        colMap.put(symbol , colMap.get(symbol) - 1);
    }
}
