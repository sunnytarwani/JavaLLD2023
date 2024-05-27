package Projects.TicTacToe.Strategies;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{

    Map<Integer , Map<Character , Integer>> hashMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        char symbol = move.getPlayer().getSymbol();

        //check if current row is present in hashmap

        if(!hashMap.containsKey(row)){
            hashMap.put(row , new HashMap<>());
        }

        Map<Character , Integer> rowMap = hashMap.get(row);

        if(!rowMap.containsKey(symbol)){
            rowMap.put(symbol , 0);
        }
        rowMap.put(symbol , rowMap.get(symbol)+1);

        if(board.getBoard().size() == rowMap.get(symbol)){
            return true;
        }
        return false;
    }

    @Override
    public void undo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        char symbol = lastMove.getPlayer().getSymbol();

        Map<Character , Integer>  rowMap = hashMap.get(row);
        rowMap.put(symbol , rowMap.get(symbol) - 1);
    }
}
