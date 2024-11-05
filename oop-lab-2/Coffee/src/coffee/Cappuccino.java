package coffee;

public class Cappuccino extends Coffee{
    private static final String name = "Cappuccino";
    private int mlOfMilk;

    public Cappuccino makeCoffee() {
        System.out.println(">> Preparing a Classic Cappuccino <<");
        System.out.printf(" - Coffee Bean Intensity Level: %s%n", getIntensity());
        System.out.println(" - Espresso Shot: Brewed to perfection");
        System.out.printf(" - Milk Steamed: %d ml, achieving creamy texture%n", mlOfMilk);
        System.out.println(" - Combining espresso with steamed milk and adding a layer of foam");
        System.out.println("=> Your Cappuccino is now ready to enjoy!");
        return this;
    }

    public Cappuccino(Intensity intensity, int mlOfMilk){
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public static String getName() {
        return name;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }


    @Override
    public void printCoffeeDetails(String name) {
        super.printCoffeeDetails(this.name);
        System.out.println("Quantity of milk: " + mlOfMilk);
    }
}