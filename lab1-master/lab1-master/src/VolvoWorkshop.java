import java.util.ArrayList;

public class VolvoWorkshop {
    private ArrayList<Volvo240> listVolvo = new ArrayList<>();


    public void VolvoWorkshop(Volvo240 v){
        if(listVolvo.size() <= 6){
            listVolvo.add(v);

        }
    }

    public void returnVolvo240(){

    }
}
