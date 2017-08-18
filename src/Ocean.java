/**
 * Created by bruno on 14-08-17.
 */
public class Ocean {
    private Ship[][] ships = new Ship[20][20];
    private int shotsFired;
    private int hitCount = 0;
    private int shipsSunk;

    Ocean(int shotsFired){
        this.shotsFired = shotsFired;
        fillEmtyShips();
    }
    public void placeAllShipsRandomly() {}

    public boolean isOccupied(int row, int column) {
        if(this.ships[row][column].getShipType().equals("empty")){
            return false;
        }
        return true;
    }

    public boolean shootAt(int row, int column){
        this.shotsFired--;
        if(isOccupied(row,column)){
            this.hitCount++;
            return true;
        }
        return false;
    }

    public int getShotsFired() {
        return this.shotsFired;
    }

    public int getHitCount(){
        return this.hitCount;
    }

    public int getShipsSunk(){
        return this.shipsSunk;
    }

    public boolean isGameOver() {
        if (this.shipsSunk == 8) {
            return true;
        }
        return false;
    }

    public Ship[][] getShipArray(){
        return this.ships;
    }

    public void print(){
        for (int row = 0; row < ships.length; row++) {
            System.out.println(row);
            for (int column = 0; column < ships.length; column++) {
                System.out.print(column+ " ");
                if(!this.ships[row][column].getShipType().equals("empty")) {
                    System.out.print("S");
                }
                if(this.ships[row][column].getShipType().equals("empty")) {
                    System.out.print("-");
                }
                if(!this.ships[row][column].getShipType().equals("empty") && this.ships[row][column].isSunk()) {
                    System.out.print("X");
                }
                System.out.print(".");
            }
            System.out.println();
        }
    }

    private void fillEmtyShips(){
        for (int row = 0; row < ships.length; row++) {
            for (int column = 0; column < ships.length; column++) {
                ships[row][column] = new EmptySea();
            }
        }
    }
}
