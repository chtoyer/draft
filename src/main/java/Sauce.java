enum Spiciness {
    VERY_HOT("очень острый"),
    HOT("острый"),
    NOT_HOT("не острый");
    private final String description;
    Spiciness(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return description;
    }
}
public class Sauce {
    private final String name;
    private final Spiciness spiciness;

    public Sauce(String name, Spiciness spiciness) {
        this.name = name;
        this.spiciness = spiciness;
    }
    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }
}
class SauceMain {
    public static void main(String[] args) {
        Sauce mySauce = new Sauce("Песто", Spiciness.NOT_HOT);
        Sauce fireSauce = new Sauce("Чили", Spiciness.VERY_HOT);

        System.out.println(mySauce);
        System.out.println(fireSauce);
    }
}
