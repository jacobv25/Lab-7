package model;

public class EspressoCoffee extends AbstractCoffee {
    public EspressoCoffee() {
        super();
        setId(3L);
        setName("Espresso");
        setRemaining(100);
        setPrice(CMM_Util.ESPRESSO.toPlainString());
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
