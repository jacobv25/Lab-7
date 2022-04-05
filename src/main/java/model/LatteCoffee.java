package model;

public class LatteCoffee extends AbstractCoffee {
    public LatteCoffee() {
        super();
        setId(2L);
        setName("Latte");
        setRemaining(100);
        setPrice(CMM_Util.LATTE.toPlainString());
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
