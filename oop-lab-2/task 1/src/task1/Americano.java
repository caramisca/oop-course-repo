package task1;

public class Americano extends Coffee {
    private static final String name = "Americano";
    private int mlOfWater;

    public Americano(Intensity intensity, int mlOfWater){
        super(intensity);
        this.mlOfWater = mlOfWater;
    }

    public String getName(){
        return name;
    }

    public int getMlOfWater(){
        return mlOfWater;
    }


    @Override
    public void printCoffeeDetails(String name) {
        super.printCoffeeDetails(this.name);
        System.out.println("Quantity of water: " + mlOfWater + " ml");
    }
}
