package Projects.TicTacToe.BotPlayingStrategy;

import Projects.TicTacToe.Models.Board;
import Projects.TicTacToe.Models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);
}

/*
*make should analyse the board
* and make the move according for the bot
* */