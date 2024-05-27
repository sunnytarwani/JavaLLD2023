package Projects.TicTacToe.Strategies;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board , Move move);

    void undo(Board board, Move lastMove);

}
