package ricksy.business;

public class CrystalExpender {

    private int stock = 0;
    private double itemCost = 50;

    public CrystalExpender(int stock , double itemCost) {
        this.stock = stock;
        this.itemCost = itemCost;
    }

    public int stock() {
        return this.stock;
    }

    public void dispatch(CreditCard creditcard) {
        if (stock() > 0 && creditcard.pay(itemCost)) {
            this.stock -= 1;
        }
    }
}
