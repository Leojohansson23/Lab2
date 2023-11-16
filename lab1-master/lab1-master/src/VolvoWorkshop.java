import java.util.ArrayList;

public class VolvoWorkshop {
    private ArrayList<Volvo240> listVolvo = new ArrayList<>();


    public void VolvoWorkshop(Volvo240 v){
        if(listVolvo.size() <= 6){
            listVolvo.add(v);

        }
    }

    public void returnVolvo240(Volvo240 V){
        if(listVolvo.contains(V)){
            listVolvo.remove(V);
        }
    }

    public void listOfCars(){
        System.out.println(listVolvo);
    }
}
