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
    public double credit() {
        return credit;
    }

    /**
     * Comprueba si tiene credito
     * @param credit total credito de la persona
     * @return puede devolver true, significa que hay dinero o false, si no tiene dinero
     */
    public Boolean pay(double credit) {
        if((credit()  - credit) >= 0) {
            this.credit -= credit;
            return true;
        } else {return false;}
    }


    @Override
    public String toString() {
        return '\n' + "owner: " + owner + '\n' + "number: " + number() + '\n' + "credit: " + credit() + SYMBOL + '\n';
    }
}
