package task1;

public class Coffee {
    private Intensity intensity;
    private String name ;

    public Coffee makeCoffee(String name) {
        System.out.println("~ Coffee Preparation: " + name + " ~");
        System.out.printf(" - Bean Intensity: %s%n", intensity);
        System.out.println(" - Grinding beans and brewing coffee");
        System.out.println(" - Pouring freshly brewed coffee into your cup");
        System.out.println("=> Your " + name + " is ready to enjoy!");
        return this;
    }

    public Coffee(Intensity intensity) {
        this.intensity = intensity;
    }

    public String getName() {
        return name;
    }

    public Intensity getIntensity() {
        return intensity;
    }

    public void printCoffeeDetails(String name) {
        System.out.println("\nDetails for preparing a " + name + ":");
        System.out.println("The intensity is set to " + intensity);
    }
}
