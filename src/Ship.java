/**
 * Created by bruno on 14-08-17.
 */
public abstract class Ship {

    private int bowRow;
    private int bowColumn;
    private int length;
    private boolean horizontal;
    private boolean[] hit = new boolean[8];


    abstract String getShipType();

    public boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
        return true;
    }

    public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
        if (okToPlaceShipAt(row,column, horizontal,ocean)){

        }
    }

    public boolean shootAt(int row, int column) {
        return true;
    }

    @Override
    public String toString() {
        if (isSunk()){
            return "x";
        }else {
            return "S";
        }
    }

    public boolean isSunk() {
        return true;
    }

    public void setBowRow(int bowRow) {
        this.bowRow = bowRow;
    }

    public void setBowColumn(int bowColumn) {
        this.bowColumn = bowColumn;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public void setHit(boolean[] hit) {
        this.hit = hit;
    }

    public int getBowRow() {
        return bowRow;
    }

    public int getBowColumn() {
        return bowColumn;
    }

    public int getLength() {
        return length;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public boolean[] getHit() {
        return hit;
    }
}
