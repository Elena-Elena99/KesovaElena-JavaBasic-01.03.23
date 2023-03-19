package MyProject;

public class CounterStrike {
    public static void main(String[] args) {
        String team1 = "Terrorist";
        String team2 = "CounterTerrorist";
        double team1Player1 = 3;
        double team1Player2 = 20;
        double team1Player3 = 7;
        double team1Player4 = 9;
        double team1Player5 = 17;
        double team2Player1 = 3;
        double team2Player2 = 20;
        double team2Player3 = 7;
        double team2Player4 = 19;
        double team2Player5 = 17;
        double team1Points = (team1Player1 + team1Player2 + team1Player3 + team1Player4 + team1Player5) / 5;
        double team2Points = (team2Player1 + team2Player2 + team2Player3 + team2Player4 + team2Player5) / 5;
        if (team1Points == team2Points) {
            System.out.println("Нічия");
        } else if (team1Points > team2Points) {

            System.out.println("Перемогла команда " + team1 + " набрала " + team1Points + " очків");
        } else {
            System.out.println("Перемогла команда " + team2 + " набрала " + team2Points + " очків");

        }
    }

}

