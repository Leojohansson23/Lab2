import java.awt.*;

public class Scania extends truck implements Carrier{

    private int angle = 0;
    private  int maxAngle = 70;
    private boolean canMove = true;

    private int minAngle = 0;
    public Scania(){
        setNrDoors(2);
        setColor(Color.pink);
        setEnginePower(200);
        setmodelname("src.Scania");
        stopEngine();
        setCanMove(true);

    }


    public int getangle(){
        return angle;

    }
    public void setangle(int degree){
        angle = degree;

    }
    /*
    public void carrierPosMove(int degree){
        if(getCurrentSpeed() == 0) {
            if (degree >= minAngle && degree <= maxAngle) {
                setangle(degree);
            }
            else if(degree > maxAngle){setangle(maxAngle);
            }
            else{
                setangle(minAngle);

            }


        }
    }

     */
    public void carrierUpp(int degree){
        if(getCurrentSpeed() == 0) {
            if ((getangle() + degree) <= maxAngle) {
                setangle(getangle() + degree);
            }
            else {setangle(maxAngle);

            }
        }


    }
    public void carrierDown(int degree){
        if(getCurrentSpeed() == 0) {
            if ((getangle() - degree) >= minAngle) {
                setangle(getangle() - degree);
            }
            else {setangle(minAngle);
            }

        }
    }

    @Override
    public boolean getCanMove(){
        if (angle > minAngle){
            return false;
        }
        return true;
    }


    @Override
    public void carrierHigher() {
        if(getCurrentSpeed() == 0) {
            if ((getangle() + 10) <= maxAngle) {
                setangle(getangle() + 10);
            }
            else {setangle(maxAngle);

            }
        }
    }

    @Override
    public void carrierLower() {
        if(getCurrentSpeed() == 0) {
            if ((getangle() - 10) >= minAngle) {
                setangle(getangle() - 10);
            }
            else {setangle(minAngle);
            }

        }
    }
}