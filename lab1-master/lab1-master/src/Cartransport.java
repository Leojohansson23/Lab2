import java.awt.*;

public class Cartransport extends truck implements Carrier{

    private boolean carrierPos;

    public Cartransport(){
        setNrDoors(2);
        setColor(Color.gray);
        setEnginePower(250);
        setmodelname("src.Cartransport");
        stopEngine();
        setCanMove(true);



    }

/*
    public void carrierPosMove(boolean can){
        carrierMove = can;

    }

 */

    public void carrierUpp() {
        carrierPos = false;
    }

    public void carrierDown() {
        carrierPos = true;
    }

    @Override
    public boolean getCanMove() {
        if (carrierPos){
            return true;
        }
        return false;
    }

    @Override
    public void carrierHigher() {
        carrierPos = false;
    }

    @Override
    public void carrierLower() {
        carrierPos = true;
    }
}
