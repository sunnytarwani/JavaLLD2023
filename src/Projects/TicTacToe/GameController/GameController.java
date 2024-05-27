package Projects.TicTacToe.GameController;

import Projects.TicTacToe.Exception.DuplicateSymbolException;
import Projects.TicTacToe.Exception.MoreThanOneBotException;
import Projects.TicTacToe.Exception.PlayersMisMatchException;
import Projects.TicTacToe.Models.Game;
import Projects.TicTacToe.Models.Player;
import Projects.TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {

    /**
     *Why we didn't have a GameController constructor created with Game game paramter
     * --> Becuase we should beable to create multiple games
     * if I pass the constructor, it will only take single game and it will be created
     */
    public Game startGame(int dimension , List<Player> players , List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayersMisMatchException, MoreThanOneBotException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();

    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }
}
