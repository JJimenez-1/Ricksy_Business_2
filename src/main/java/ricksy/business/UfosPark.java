package ricksy.business;

import java.util.HashMap;
import java.util.Map;

public class UfosPark {

    private final double fee = 500;
    private Map<String, String> flota = new HashMap<String, String>();

    public UfosPark() {}

    public void add (String ufo) {
        flota.put(ufo, null);
    }

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
}
