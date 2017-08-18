/**
 * Created by bruno on 14-08-17.
 */
public class EmptySea extends Ship {

    public EmptySea(){
        super();
        super.setLength(1);
    }

    @Override
    public boolean shootAt(int row, int column) {
        return false;
    }

    @Override
    public boolean isSunk(){
        return false;
    }

    @Override
    public String toString() {
        return "EmptySea";
    }

    @Override
    public String getShipType(){
        return "empty";
    }
}
