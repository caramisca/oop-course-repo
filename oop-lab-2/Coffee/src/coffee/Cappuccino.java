package coffee;

public class Cappuccino extends Coffee{
    private int mlOfMilk;

    public Cappuccino(String name , Intensity intensity, int mlOfMilk){
        super(name, intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino(Intensity coffeeIntensity, int mlOfMilk) {
        super("Cappuccino", coffeeIntensity);
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino makeCappuccino(){
        this.makeRecipe();
        return this;
    }

    @Override
    public void makeRecipe(){
        super.makeRecipe();
        System.out.printf(" - Milk Steamed: %d ml, achieving creamy texture%n", mlOfMilk);
        System.out.println(" - Combining espresso with steamed milk and adding a layer of foam");

    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(" - Milk quantity: " + mlOfMilk);
    }

    @Override
    public String toString() {
        return super.toString() +
                "mlOfMilk = " + mlOfMilk;
    }
}