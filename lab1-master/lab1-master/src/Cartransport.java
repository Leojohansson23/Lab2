import java.awt.*;
import java.util.ArrayList;

public class Cartransport extends truck implements Carrier{


    private ArrayList<Moveable> ramparraylist = new ArrayList<>();

    public ArrayList<Moveable> getRamparraylist() {
        return ramparraylist;
    }
    private boolean carrierPos;


    public Cartransport(){
        setNrDoors(2);
        setColor(Color.gray);
        setEnginePower(250);
        setmodelname("src.Cartransport");
        stopEngine();
        setCanMove(true);



    }


    @Override
    public boolean getCanMove() {
        if (carrierPos){
            return false;
        }
        return true;
    }

    public void addcar(Moveable smallcar){
        if (carrierPos && ramparraylist.size() <= 8) {

            if(smallcar instanceof truck) {

            } else {
                ramparraylist.add(smallcar);
            }
        }
    }

    public int getcarsoncarrier (){
        return ramparraylist.size();
    }

    public void removecar(){
        if (carrierPos) {
            ramparraylist.remove(ramparraylist.size() - 1);
        }

    }


}





