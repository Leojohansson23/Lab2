import java.util.ArrayList;

public class AllWorkshop {

    private ArrayList<Car> AllcarList = new ArrayList<>();
    public AllWorkshop(Car i){
        if(AllcarList.size() <=8){
            AllcarList.add(i);
        }

    }
    public void returnAll(){

    }
}
