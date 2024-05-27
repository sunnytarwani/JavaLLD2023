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
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DuplicateSymbolException, PlayersMisMatchException, MoreThanOneBotException {
        GameController gameController = new GameController();

        Scanner scanner = new Scanner(System.in);

        int dimension = 3;
        List<Player> players = new ArrayList<>();
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        players.add(new Player(1 ,'x' , "SUUNNY" , PlayerType.HUMAN));
        players.add(new Bot(2 ,'o' , "KETTAN" , PlayerType.BOT , DifficultyLevel.EASY));
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());


        Game game = gameController.startGame(dimension , players , winningStrategies);
        game.printBoard();
        gameController.makeMove(game);


        while (game.getGameState().equals(GameState.IN_PROGESS)){
            game.printBoard();

            System.out.println("Does any one wants to undo? (y/n) ");
            String undo = scanner.next();

            if(undo.equalsIgnoreCase("Y")){
                gameController.undo(game);
                continue;
            }

            gameController.makeMove(game);


        }

        //If I'm here, it means game is not in progress anymore
        if(GameState.SUCCESS.equals(game.getGameState())){
            game.printBoard();
            System.out.println(game.getWinner().getName() + " , You have won the game! Congratulations!");
        }

        if(GameState.DRAW.equals(game.getGameState())){
            game.printBoard();
            System.out.println("Match Tied!");
        }


    }
}
