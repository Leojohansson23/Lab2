import java.awt.*;

public class Scania extends truck{

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

    @Override
    public boolean getCanMove(){
        if (angle > minAngle){
            return false;
        }
        return true;
    }


}