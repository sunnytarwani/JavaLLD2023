package Projects.TicTacToe.Strategies;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Move;

public class DiagonalWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
