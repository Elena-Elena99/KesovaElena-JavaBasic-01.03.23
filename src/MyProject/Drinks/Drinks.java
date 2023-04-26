package MyProject.Drinks;

public class Drinks {
    public int drinkName = 0;
    private double price = 0;
    public int quan = 0;
    static double coffee = 4.5;
    static double tea = 1.5;
    static double lemonade = 3.5;
    static double mojito = 5;
    static double mineral_water = 1;
    static double coca_cola = 3;
    public void PrintDrinks() {
        System.out.println("1- " + DrinksMachine.COFFEE.getCode() + " price - " + coffee);
        System.out.println("2- " + DrinksMachine.TEA.getCode() + " price - " + tea);
        System.out.println("3- " + DrinksMachine.LEMONADE.getCode() + " price - " + lemonade);
        System.out.println("4- " + DrinksMachine.MOJITO.getCode() + " price - " + mojito);
        System.out.println("5- " + DrinksMachine.MINERAL_WATER.getCode() + " price - " + mineral_water);
        System.out.println("6- " + DrinksMachine.COCA_COLA.getCode() + " price - " + coca_cola);
        System.out.println("0 - Cancel");
    }
    public void Choice() {
        switch (drinkName) {
            case 1:
                System.out.println(MakeDrink(DrinksMachine.COFFEE.getCode()));
                price = price + (quan * coffee);
                break;
            case 2:
                System.out.println(MakeDrink(DrinksMachine.TEA.getCode()));
                price = price + (quan * tea);
                break;
            case 3:
                System.out.println(MakeDrink(DrinksMachine.LEMONADE.getCode()));
                price = price + (quan * lemonade);
                break;
            case 4:
                System.out.println(MakeDrink(DrinksMachine.MOJITO.getCode()));
                price = price + (quan * mojito);
                break;
            case 5:
                System.out.println(MakeDrink(DrinksMachine.MINERAL_WATER.getCode()));
                price = price + (quan * mineral_water);
                break;
            case 6:
                System.out.println(MakeDrink(DrinksMachine.COCA_COLA.getCode()));
                price = price + (quan * coca_cola);
                break;
        }
    }
    public String MakeDrink(String name) {
        return "Making " + name;
    }
    public void TotalPrice() {
        System.out.println("Total: " + price);
    }
}
