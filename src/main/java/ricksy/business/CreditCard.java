package ricksy.business;

public class CreditCard {

    private String owner = null;
    private String number = null;
    private double credit = 3000.0d;
    private String SYMBOL = "EZI";

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    public String number() {
        return number;
    }
}