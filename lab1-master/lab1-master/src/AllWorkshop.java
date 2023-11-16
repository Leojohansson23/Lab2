import java.util.ArrayList;

public class AllWorkshop {

    private ArrayList<Car> listAllCars = new ArrayList<>();
    public AllWorkshop(Car i){
        if(listAllCars.size() <=8){
            listAllCars.add(i);
        }

    }
    public <Car> void returnAllTypeCars(Car C){
        if(listAllCars.contains(C)){
            listAllCars.remove(C);
        }
    }

    public void listOfCars(){
        System.out.println(listAllCars);
    }
}
