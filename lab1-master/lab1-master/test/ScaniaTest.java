import junit.framework.TestCase;
import org.junit.Test;

public class ScaniaTest extends TestCase {


    @Test
    public void testhigher (){
        Scania truck = new Scania();
        truck.carrierUpp(100);
        assertEquals(20,truck.getangle());

    }

    @Test
    public void testlower(){
        Scania truck = new Scania();
        truck.carrierUpp(60);
        truck.carrierDown(10);
        assertEquals(50,truck.getangle());


    }

    @Test
    public void testscania(){
        Scania test = new Scania();
        test.carrierUpp(60);
        test.carrierUpp(60);
        assertEquals(true,test.getCanMove());


    }
}