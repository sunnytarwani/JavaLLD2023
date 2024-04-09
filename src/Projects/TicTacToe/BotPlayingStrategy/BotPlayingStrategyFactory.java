package Projects.TicTacToe.BotPlayingStrategy;

import Projects.TicTacToe.Models.DifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyDifficultyLevel(DifficultyLevel difficultyLevel){
//        if(difficultyLevel.equals(DifficultyLevel.EASY)){
//            return new EasyBotPlayingStrategy();
//        }
//        else if (difficultyLevel.equals(DifficultyLevel.MEDIUM)) {
//            return new MediumBotPlayingStrategy();
//        }
//        else{
//            return null;
//        }

        return new EasyBotPlayingStrategy();
    }
}
