package Projects.TicTacToe.Models;

import Projects.TicTacToe.BotPlayingStrategy.BotPlayingStrategy;
import Projects.TicTacToe.BotPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player {

    private DifficultyLevel difficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(int id , char symbol, String name, PlayerType playerType, DifficultyLevel difficultyLevel) {
        super(id ,symbol, name, playerType);
        this.difficultyLevel = difficultyLevel;
        this.botPlayingStrategy =
                BotPlayingStrategyFactory.getBotPlayingStrategyDifficultyLevel(difficultyLevel);

    }

    @Override
    public Cell makeMove(Board board){
        System.out.println("Get ready for GPT's Move!");
        Cell cell = botPlayingStrategy.makeMove(board);
        cell.setPlayer(this);
        cell.setCellState(CellState.FILLED);
        return cell;
    }
}
