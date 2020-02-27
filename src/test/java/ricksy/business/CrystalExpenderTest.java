package ricksy.business;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrystalExpenderTest {

    @Test
    public void getStockTest() {
        CrystalExpender crystalexpender = new CrystalExpender(3, 50);
        assertEquals(3, crystalexpender.stock());
    }

}
