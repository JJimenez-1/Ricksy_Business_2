package ricksy.business;

import org.junit.Test;
import static org.junit.Assert.*;

public class UfosParkTest {
    /**
    UfosPark ufos = null;
     */
    String[] ovnis = { "unx", "dox", "trex" };

    /**
     * Testea el metodo añadir ovni 
     * a la flota de ufos
     */
    @Test
    public void addUfoTest() {
        UfosPark park = new UfosPark();
        for (String ovni : ovnis) {
            park.add(ovni);
        }
        assertEquals(3, park.getFlota().size());
    }

    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de crédito.
     * El crédito de la tarjeta varía.
     */
    @Test
    public void dispatchTest() {
        UfosPark park = new UfosPark();
        CreditCard creditcard = new CreditCard("Hitler", "444444");
        for (String ovni : ovnis) {
            park.add(ovni);
            park.dispatch(creditcard);
            assertEquals("unx" , park.getUfoOf(creditcard.number()));
        }
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay crédito suficiente en la tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoCreditTest() {

    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El crédito de la tarjeta no varía.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    @Test
    public void getUfoOfTest() {
    }
}