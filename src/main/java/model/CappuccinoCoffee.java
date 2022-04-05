package model;

public class CappuccinoCoffee extends AbstractCoffee {
    public CappuccinoCoffee() {
        super();
        setId(4L);
        setName("Cappuccino");
        setRemaining(100);
        setPrice(CMM_Util.CAPPUCCINO.toPlainString());
    }
    @Override
    public void sip() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void empty() {

    }

    @Override
    public void coolDown() {

    }
}
