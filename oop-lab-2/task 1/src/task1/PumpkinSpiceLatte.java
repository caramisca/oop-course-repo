package task1;

public class PumpkinSpiceLatte extends Coffee{
    private static final String name = "PumpkinSpiceLatte";
    private int mlOfMilk;
    private int mgOfPumpkinSpice;


    public PumpkinSpiceLatte makeCoffee() {
        System.out.println("~~~ Crafting Your Pumpkin Spice Latte ~~~");
        System.out.printf("1. Intensity Level: %s%n", getIntensity());
        System.out.println("2. Espresso Shot: Brewed rich and strong");
        System.out.printf("3. Steaming Milk: %d ml with %d mg of pumpkin spice for a seasonal touch%n", mlOfMilk, mgOfPumpkinSpice);
        System.out.println("4. Blending spiced milk with espresso and adding a delicate foam layer");
        System.out.println(">>> Your Pumpkin Spice Latte is ready to enjoy! <<<");
        return this;
    }

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
