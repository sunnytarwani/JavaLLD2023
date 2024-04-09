package Projects.TicTacToe.AppRunner;

import Projects.TicTacToe.Exception.DuplicateSymbolException;
import Projects.TicTacToe.Exception.MoreThanOneBotException;
import Projects.TicTacToe.Exception.PlayersMisMatchException;
import Projects.TicTacToe.GameController.GameController;
import Projects.TicTacToe.Models.*;
import Projects.TicTacToe.Strategies.ColumnWinningStrategy;
import Projects.TicTacToe.Strategies.DiagonalWinningStrategy;
import Projects.TicTacToe.Strategies.RowWinningStrategy;
import Projects.TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws DuplicateSymbolException, PlayersMisMatchException, MoreThanOneBotException {
        GameController gameController = new GameController();

        int dimension = 3;
        List<Player> players = new ArrayList<>();
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        players.add(new Player(1 ,'x' , "SUUNNY" , PlayerType.HUMAN));
        players.add(new Bot(2 ,'o' , "KETTAN" , PlayerType.BOT , DifficultyLevel.EASY));
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());


        Game game = gameController.startGame(dimension , players , winningStrategies);
        while (game.getGameState().equals(GameState.IN_PROGESS)){
            game.printBoard();
            gameController.makeMove(game);
        }

        if(GameState.SUCCESS.equals(game.getGameState())){
            System.out.println(game.getWinner().getName() + " , You have won the game! Congratulations!");
        }

        if(GameState.DRAW.equals(game.getGameState())){
            System.out.println("Match Tied!");
        }
    }
}
