package coffee;

public class PumpkinSpiceLatte extends Cappuccino{
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice){
        super("Pumpkin Spice Latte", intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public PumpkinSpiceLatte makePumpkinSpice(){
        this.makeRecipe();
        return this;
    }

    @Override
    public void makeRecipe(){
        super.makeRecipe();
        System.out.printf(" - Adding %d mg of pumpkin spice \n", mgOfPumpkinSpice);
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        //System.out.println(" - Milk quantity: " + mlOfMilk);
        System.out.println(" - Quantity of pumpkin spice: " + mgOfPumpkinSpice + " mg");
    }

    @Override
    public String toString() {
        return super.toString() +
                "mgOfPumpkinSpice = " + mgOfPumpkinSpice;
    }
}
