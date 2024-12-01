package coffee;

public class SyrupCappuccino extends Cappuccino{
    private SyrupType syrup;

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup){
        super("Syrup Cappuccino",intensity, mlOfMilk);
        this.syrup = syrup;
    }


    public SyrupCappuccino makeSyrupCappuccino() {
        super.makeRecipe();
        System.out.printf(" - Adding Syrup: %s flavor\n", syrup);
        return this;
    }

    @Override
    public void makeRecipe(){
        super.makeRecipe();

    }

    public SyrupType getSyrup(){
        return syrup;
    }
    public void setSyrup(SyrupType syrup) {
        this.syrup = syrup;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(" - Type of syrup: " + syrup);
    }

    @Override
    public String toString() {
        return super.toString() +
                "syrup = " + syrup;
    }
}
