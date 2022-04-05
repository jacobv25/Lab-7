package model;

public class MochaCoffee extends AbstractCoffee {
    public MochaCoffee() {
        super();
        setId(1L);
        setName("Mocha");
        setRemaining(100);
        setPrice(CMM_Util.MOCHA.toPlainString());
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
