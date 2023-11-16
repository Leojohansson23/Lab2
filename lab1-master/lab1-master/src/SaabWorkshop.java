import javax.swing.*;
import java.util.ArrayList;



public class SaabWorkshop {

    private ArrayList<Saab95> listSaab  = new ArrayList<>();


    public void SaabWorkshop(Saab95 s){
        if(listSaab.size() <= 10){
             listSaab.add(s);

        }
    }
    public <Saab95> void returnSaab95(Saab95 S){
        if(listSaab.contains(S)){
            listSaab.remove(S);
        }
    }
    public void listOfCars(){
        System.out.println(listSaab);
    }

}



