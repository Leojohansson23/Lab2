import java.awt.*;

public class Cartransport extends truck {

    private boolean carrierMove;

    public Cartransport(){
        setNrDoors(2);
        setColor(Color.gray);
        setEnginePower(250);
        setmodelname("src.Cartransport");
        stopEngine();
        setCanMove(true);



    }


    public void carrierPosMove(boolean can){
        carrierMove = can;

    }
    @Override
    public boolean getCanMove() {
        if (carrierMove){
            return false;
        }
        return true;
    }

}
