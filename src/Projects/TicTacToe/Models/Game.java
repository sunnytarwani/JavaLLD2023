package Projects.TicTacToe.Models;

import Projects.TicTacToe.Exception.DuplicateSymbolException;
import Projects.TicTacToe.Exception.MoreThanOneBotException;
import Projects.TicTacToe.Exception.PlayersMisMatchException;
import Projects.TicTacToe.Strategies.WinningStrategy;

import java.util.*;

public class Game {

    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;


    private Game(int dimension , List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGESS;
        this.nextPlayerIndex = 0;
        this.moves = new ArrayList<>();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void printBoard() {
        board.printBoard();
    }

    public void makeMove() {
        Player player1 = players.get(nextPlayerIndex);
        Cell cell = player1.makeMove(board);
        Move move = new Move(cell , player1);
        moves.add(move);
        if(checkWinner(board , move)){
            gameState = GameState.SUCCESS;
            winner = player1;
            return;
        }

        if (moves.size() == board.getDimension() * board.getDimension() ){
            gameState = GameState.DRAW;
            return;
        }

        nextPlayerIndex++;
        nextPlayerIndex = nextPlayerIndex % players.size();
    }

    private boolean checkWinner(Board board, Move move) {
        for(WinningStrategy winningStrategy : winningStrategies){
            if (winningStrategy.checkWinner(board , move)){
                return true;
            }
        }
        return false;
    }

    public void undo() {
        if(moves.size() == 0){
            System.out.println("No moves to remove");
            return;
        }

        Move lastMove = moves.get(moves.size() - 1);
        moves.remove(lastMove);

        Cell cell = lastMove.getCell();
        cell.setCellState(CellState.EMPTY);
        cell.setPlayer(null);


        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.undo(board , lastMove);
        }

        if(nextPlayerIndex != 0){
            nextPlayerIndex--;
        }
        else{
            nextPlayerIndex = players.size()-1;
        }
    }

    public static class Builder{
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;
        private int dimension;


        //Builder Design pattern has been used.
        private Builder() {
            this.players = new ArrayList<>();
            this.winningStrategies = new ArrayList<>();
            this.dimension = 0;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Game build() throws MoreThanOneBotException, DuplicateSymbolException, PlayersMisMatchException {
            /*
            * Validation:
            * 1> Validate the bot count (<=1)
            * 2> Validate the unique symbols for players
            * 3> Validate dimensions and player count
            * */
            validateBotCount();
            validateUniqueSymbolForPlayers();
            validateDimensionAndPlayerCount();
            return new Game(dimension , players , winningStrategies);
        }

        public void validateBotCount() throws MoreThanOneBotException {
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    botCount++;
                }
            }

            if(botCount>1){
                throw new MoreThanOneBotException();
            }
        }

        public void validateUniqueSymbolForPlayers() throws DuplicateSymbolException {
            Set<Character> symbols = new HashSet<>();

            for(Player player:players){
                if(symbols.contains(player.getSymbol())){
                    throw new DuplicateSymbolException();
                }
                else{
                    symbols.add(player.getSymbol());
                }
            }
        }

        public void validateDimensionAndPlayerCount() throws PlayersMisMatchException {
            if(players.size()!=(dimension-1)){
               throw new PlayersMisMatchException();
            }
        }
    }


    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }
}
