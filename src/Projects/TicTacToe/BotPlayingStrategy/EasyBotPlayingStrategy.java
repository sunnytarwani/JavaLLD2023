package Projects.TicTacToe.BotPlayingStrategy;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Cell;
import Projects.TicTacToe.Models.CellState;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Cell makeMove(Board board) {
        for(List<Cell> row : board.getBoard()){
            for(Cell cell : row){
                if(CellState.EMPTY.equals(cell.getCellState())){
                    return cell;
                }
            }
        }
        return null;
    }
}
