package MyProject;

public class MainUser {
    public static void main(String[] args) {
        User first = new User("Elena", "elena@ukr.net", "0672626268", "31", "01",
                1988, "Simonova", 57, "120/70", 5000);
        User second = new User("Olga", "olga@ukr.net", "0676626268", "01", "07",
                1983, "Petrova", 52, "111/68", 5200);
        User third = new User("Nataly", "nata@ukr.net", "0506626268", "25", "10",
                1979, "Sydorova", 60, "122/68", 10000);
        User fourth = new User("Svetlana", "svet@ukr.net", "0676555268", "15", "07",
                1984, "Svetlova", 61, "107/70", 3500);
        User fifth = new User("Irina", "olga@ukr.net", "0676626268", "13", "09",
                1989, "Pavlova", 57, "107/65", 5000);
        System.out.println(first.printAccountInfo());
        System.out.println(second.printAccountInfo());
        System.out.println(third.printAccountInfo());
        System.out.println(fourth.printAccountInfo());
        System.out.println(fifth.printAccountInfo());
        first.setPressure("110/60");
        first.setWeight(56);
        first.setNumberStepsTaken(2000);
        first.setSurname("Ivanova");
        third.setSurname("Veselova");
        third.setWeight(66);
        System.out.println(first.printAccountInfo());
        System.out.println(third.printAccountInfo());
    }
}
