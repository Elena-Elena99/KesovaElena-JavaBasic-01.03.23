package MyProject;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regular = new Burger();
        Burger doubleMeat = new Burger("double meat");
        Burger diet = new Burger("meat", "without mayonnaise");
    }
}
