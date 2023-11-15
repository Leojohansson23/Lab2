import javax.swing.*;
import java.util.ArrayList;



public class SaabWorkshop {

    private ArrayList<Saab95> listSaab  = new ArrayList<>();


    public void SaabWorkshop(Saab95 s){
        if(listSaab.size() <= 10){
             listSaab.add(s);

        }
    }
    public void returnSaab95(){

    }
    public void getSaabList(){
        //System.out.println(ListSaab);
    }

}



