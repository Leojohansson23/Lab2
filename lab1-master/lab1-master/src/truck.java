
public class truck extends Car{
    private boolean canMove;

    public boolean getCanMove(){return canMove;}

    public boolean setCanMove(boolean can){return this.canMove = can;}

    //public void carrierPosMove(){
    //}
    public void carrierUpp(){

    }
    public void carrierDown(){

    }


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
