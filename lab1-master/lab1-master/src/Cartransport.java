import java.awt.*;
import java.util.ArrayList;
import java.math.*;

public class Cartransport extends truck implements Carrier{




     private ArrayList<Car> ramparraylist = new ArrayList<>();

    public ArrayList<Car> getRamparraylist() {
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

    public void addcar(Car smallcar){
        if(Math.abs(smallcar.getXpos() - this.getXpos()) <= 0.5 && Math.abs(smallcar.getYpos() - this.getYpos()) <= 0.5)
            if (carrierPos && ramparraylist.size() <= 8) {
                smallcar.setXpos(this.getXpos());
                smallcar.setYpos(this.getYpos());
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
        if (carrierPos){
            ramparraylist.get(ramparraylist.size() - 1).setXpos(this.getXpos() + 0.2);
            ramparraylist.get(ramparraylist.size() - 1).setYpos(this.getYpos() + 0.2);

            //set xpos to something greater or lesser;
            ramparraylist.remove(ramparraylist.size() - 1);
        }



    }


    @Override
    public void carrierHigher() {
        carrierPos = false;
    }

    @Override
    public void carrierLower() {
        carrierPos = true;
    }


    @Override
    public void move() {

        super.move();
        for(Moveable car : ramparraylist){
                car.move();
        }
    }
}





