package ricksy.business;

import org.junit.Test;
import static org.junit.Assert.*;

public class CrystalExpenderTest {

    @Test
    public void getStockTest() {
        CrystalExpender crystalexpender = new CrystalExpender(3, 50);
        assertEquals(3, crystalexpender.stock());
    }

    @Test
    public void dispatchHayStockTest() {
        CrystalExpender crystalexpender = new CrystalExpender(3, 50);
        CreditCard creditcard = new CreditCard("Honey" , "123");
        crystalexpender.dispatch(creditcard);
        assertEquals(2, crystalexpender.stock());
    }

    @Test
    public void dispatchNoHayStock() {
        CrystalExpender crystalexpender = new CrystalExpender(0, 50);
        CreditCard creditcard = new CreditCard("Honey" , "123");
        crystalexpender.dispatch(creditcard);
        assertEquals(0, crystalexpender.stock());
    }

    @Test
    public void dispatchNoHayDinero() {
        CrystalExpender crystalexpender = new CrystalExpender(3, 50);
        CreditCard creditcard = new CreditCard("Honey" , "123");
        creditcard.pay(3000);
        crystalexpender.dispatch(creditcard);
        assertEquals(3, crystalexpender.stock());
    }


}
