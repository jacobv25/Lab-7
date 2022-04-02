package model;

public class RegularCoffee extends AbstractCoffee {
    public RegularCoffee(){
        super();
        setId(0L);
        setName("Regular");
        setRemaining(100);
        setPrice(CMM_Util.REGULAR.toPlainString());
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
