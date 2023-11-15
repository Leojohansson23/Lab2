import junit.framework.TestCase;
import org.junit.Test;

public class CartransportTest extends TestCase {


    @Test
    public void testTransport(){
        Cartransport testcar = new Cartransport();
        testcar.carrierHigher();
        assertEquals(false,testcar.getCanMove());

    }

    @Test
    public void testAddCarToCarrier(){
        Cartransport testcar = new Cartransport();
        testcar.carrierLower();
        Volvo240 testvolvo = new Volvo240();
        testcar.addcar(testvolvo);
        assertEquals(1, testcar.getcarsoncarrier());

    }


}