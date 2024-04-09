package Projects.TicTacToe.Models;

public class Cell {

    private int row;
    private int column;
    private CellState cellState;
    private Player player;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.cellState = CellState.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void display() {
        /*
        * A good developer practice is to check if the player or any other cell is not null
        * sometimes in the prod code you might get null pointer exception because the player was null.
        * you have to check each and every edge case.
        * */

        if(CellState.FILLED.equals(cellState)){
            System.out.print("| " + player.getSymbol() + " |");
        }
        else if(CellState.EMPTY.equals(cellState)){
            System.out.print("| - |");
        }
    }
}
