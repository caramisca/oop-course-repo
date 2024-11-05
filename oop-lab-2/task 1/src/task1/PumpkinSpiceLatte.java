package task1;

public class PumpkinSpiceLatte extends Coffee{
    private static final String name = "PumpkinSpiceLatte";
    private int mlOfMilk;
    private int mgOfPumpkinSpice;

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice){
        super(intensity);
        this.mlOfMilk = mlOfMilk;
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public String getName(){
        return name;
    }

    public int getMlOfMilk(){
        return mlOfMilk;
    }

    public int getMgOfPumpkinSpice(){
        return mgOfPumpkinSpice;
    }


    @Override
    public void printCoffeeDetails(String name) {
        super.printCoffeeDetails(this.name);
        System.out.println("Quantity of milk: " + mlOfMilk + " ml");
        System.out.println("Quantity of pumpkin spice: " + mgOfPumpkinSpice + " mg");
    }
}
