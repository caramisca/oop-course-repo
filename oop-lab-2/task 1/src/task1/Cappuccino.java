package task1;

public class Cappuccino extends Coffee{
    private static final String name = "Cappuccino";
    private int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk){
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public String getName() {
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