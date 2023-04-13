package MyProject;

public class Burger {
    String meat = "meat";
    String mayonnaise = "mayonnaise";
    String cheese = "cheese";
    String bun = "bun";
    String greens = "greens";


    public Burger() {
        System.out.println("Regular burger composition: " + this.bun +" "+ this.cheese +" "+ this.greens +" "+
                this.meat +" "+ this.mayonnaise);
    }
    public Burger(String meat) {
        this.meat = meat;
        System.out.println("Double meat burger composition: " + this.bun +" "+ this.cheese +" "+ this.greens +" "+
                this.meat +" "+ this.mayonnaise);
    }
    public Burger(String meat, String mayonnaise) {
        this.meat = meat;
        this.mayonnaise = mayonnaise;
        System.out.println("Diet burger composition: " + this.bun +" "+ this.cheese +" "+ this.greens +" "+
                this.meat);
    }
}