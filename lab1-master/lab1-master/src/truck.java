import java.awt.*;

public abstract class truck extends Car{
    private boolean canMove;

    public truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(2,275,Color.cyan, "src.truck");
    }


    public boolean getCanMove(){return canMove;}

    public boolean setCanMove(boolean can){return this.canMove = can;}




    @Override
    public void move() {
        if(getCanMove()) {
            int value = (getDirection() % 360);
            value = (value / 90);
            switch (value) {
                case 0:
                    setXpos(getXpos() + getCurrentSpeed());
                    break;
                case 1:
                    setYpos(getYpos() + getCurrentSpeed());
                    break;
                case 2:
                    setXpos(getXpos() - getCurrentSpeed());
                    break;
                case 3:
                    setYpos(getYpos() - getCurrentSpeed());
                    break;
            }
        }
    }


}
