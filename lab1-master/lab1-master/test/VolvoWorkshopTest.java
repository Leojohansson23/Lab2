import junit.framework.TestCase;
import org.junit.Test;

public class VolvoWorkshopTest extends TestCase {

    @Test
    public void testVolvoWork(){
        VolvoWorkshop Work = new VolvoWorkshop();
        Volvo240 volvotest = new Volvo240();
        Volvo240 volvotest1 = new Volvo240();
        Volvo240 volvotest2 = new Volvo240();
        Saab95 Saab = new Saab95();
        Work.VolvoWorkshop(volvotest);
        Work.VolvoWorkshop(volvotest1);
        Work.VolvoWorkshop(volvotest2);
        Work.listOfCars();
        Work.returnVolvo240(Saab);
        Work.listOfCars();



    }



}