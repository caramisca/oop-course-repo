package task1;

public class SyrupCappuccino extends Cappuccino{
    private static final String name = "SyrupCappuccino";
    private SyrupType syrup;

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup){
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }


    public SyrupCappuccino makeCoffee() {
        System.out.println(":: Crafting a Delicious Syrup Cappuccino ::");
        System.out.printf(" - Bean Intensity: %s%n", getIntensity());
        System.out.println(" - Espresso Shot: Brewed rich and bold");
        System.out.printf(" - Adding Syrup: %s flavor%n", syrup);
        System.out.printf(" - Milk Steamed: %d ml, creating a creamy texture%n", getMlOfMilk());
        System.out.printf(" - Finishing Touch: Topped with foam and a hint of %s syrup%n", syrup);
        System.out.println(">>> Your Syrup Cappuccino is ready to enjoy! <<<");
        return this;
    }


    public String getName(){
        return name;
    }

    public SyrupType getSyrup(){
        return syrup;
    }

    @Override
    public void printCoffeeDetails(String name) {
        super.printCoffeeDetails(this.name);
        System.out.println("Type of syrup: " + syrup);
    }
}
