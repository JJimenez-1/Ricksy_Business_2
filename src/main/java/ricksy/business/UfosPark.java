package ricksy.business;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class UfosPark {

    private final double fee = 500;
    private Map<String, String> flota = new HashMap<String, String>();

    public UfosPark() {}

    /**
     * Añade un ufo a la flota de ufos
     * @param ufo es el ufo que se va ha añadir en la flota de ufos
     */
    public void add (String ufo) {
        flota.put(ufo, null);
    }

    /**
     * Comprueba si la persona puede comprar el ufo
     * @param creditcard es la tarjeta de credito de la persona que quiere comprar el ufo
     */
    public void dispatch(CreditCard creditcard) {
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo) == null) {
                if (creditcard.pay(fee)){
                    flota.put(ufo, creditcard.number());
                }
            }
            if (flota.get(ufo) == creditcard.number()) {
                break;
            }
         }
    }

    /**
     * Da un ufo que la persona puede alquilar.
     * @param creditcard es la tarjeta de credito de la persona (comprueba si hay dinero)
     * @return devuelve el nombre del ufo, si es posible obtenerlo
     */
    public String getUfoOf(String creditcard) {
        String ufoName = null;
        for (String ufo : flota.keySet()) {
            if (flota.get(ufo) == creditcard) {
                ufoName = ufo;
            }
        }
        return ufoName;
    }

    Map<String, String> getFlota() {
        return this.flota;
    }

    @Override
    public String toString() {
        List<String> listNumbers = new ArrayList<String>(flota.keySet());
        return listNumbers.toString();
    }
}
