package ricksy.business;

public class CrystalExpender {

    private int stock = 0;
    private double itemCost = 50;

    public CrystalExpender(int stock , double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    /**
     *
     * @return devuelve el total de paquetes que hay en el stock
     */
    public int stock() {
        return this.stock;
    }

    /**
     * Comprueba si hay packs en el stock, y tiene el dinero para pagar,
     * resta el dinero y le da un pack al invitado. (Pack es restado del stock)
     * @param creditcard
     */
    public void dispatch(CreditCard creditcard) {
        if (stock() > 0 && creditcard.pay(itemCost)) {
            this.stock -= 1;
        }
    }
}
