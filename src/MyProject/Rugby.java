package MyProject;

public class Rugby {
    public static void main(String[] args) {
        String team1 = "Black heath";
        String team2 = "Life";
        int[] arrayAgeTeam1 = new int[25];
        int[] arrayAgeTeam2 = new int[25];
        int min = 18;
        int max = 22;
        System.out.println("Age of team players - " + team1 + ":");
        for (int i = 0; i < 25; i++) {
            arrayAgeTeam1[i] = min + (int) (Math.random() * max);
        }
        for (int age1 : arrayAgeTeam1) {
            System.out.print(age1);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("Age of team players - " + team2 + ":");
        for (int i = 0; i < 25; i++) {
            arrayAgeTeam2[i] = min + (int) (Math.random() * max);
        }
        for (int age2 : arrayAgeTeam2) {
            System.out.print(age2);
            System.out.print(", ");
        }
        int sumAge = 0;
        for (int i = 0; i < 25; i++) {
            sumAge = sumAge + arrayAgeTeam1[i];
        }
        System.out.println();
        System.out.println("Average age of team players " + team1 + " - " + sumAge / 25);
        sumAge = 0;
        for (int i = 0; i < 25; i++) {
            sumAge = sumAge + arrayAgeTeam2[i];
        }
        System.out.println();
        System.out.println("Average age of team players " + team2 + " - " + sumAge / 25);
    }
}

