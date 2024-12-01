package coffee;

public class Coffee{
    private Intensity intensity;
    private String name;

    public Coffee(String name, Intensity intensity) {
        this.name = name;
        this.intensity = intensity;
    }
    public void makeRecipe() {
        System.out.println("--- Preparing " + name + " ---");
        System.out.println(" - Grinding beans to " + intensity + " intensity" );
        System.out.println(" - Brewing an espresso shot and poring it into the cup ");
    }

    public Coffee makeCoffee(){
        this.makeRecipe();
        return this;
    }

    public String getName() {
        return name;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public void printCoffeeDetails() {
        System.out.println("\n");
        System.out.println("Coffee type:  " + getName());
        System.out.println("--- Ingredients needed ---");
        System.out.println(" - Bean Intensity: " + intensity);
    }

    @Override
    public String toString() {
        return  "Name = '" + name + '\'' +
                "coffeeIntensity = " + intensity;
    }

}