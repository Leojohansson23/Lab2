import junit.framework.TestCase;
import org.junit.Test;

public class ScaniaTest extends TestCase {


    @Test
    public void testhigher (){
        Scania truck = new Scania();
        truck.carrierPosMove(100);
        assertEquals(20,truck.getangle());

    }

    @Test
    public void testlower(){
        Scania truck = new Scania();
        truck.carrierPosMove(60);
        truck.carrierPosMove(10);
        assertEquals(10,truck.getangle());


    }

    @Test
    public void testscania(){
        Scania test = new Scania();
        test.carrierPosMove(60);
        test.carrierPosMove(60);
        assertEquals(true,test.getCanMove());


    }
}