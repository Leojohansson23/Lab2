import junit.framework.TestCase;
import org.junit.Test;

public class CartransportTest extends TestCase {


    @Test
    public void transporttest(){
        Cartransport testcar = new Cartransport();
        testcar.carrierPosMove(true);
        assertEquals(false,testcar.getCanMove());

    }


}