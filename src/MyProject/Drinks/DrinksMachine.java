package MyProject.Drinks;
public enum DrinksMachine {
    COFFEE("Coffee"),
    TEA("Tea"),
    LEMONADE("Lemonade"),
    MOJITO("Mojito"),
    MINERAL_WATER("Mineral water"),
    COCA_COLA("Coca-Cola");
    private final String name;
    DrinksMachine(String name) {
        this.name = name;
    }
    public String getCode() {
        return name;
    }
}
