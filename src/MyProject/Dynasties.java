package MyProject;

public class Dynasties {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        double countLi = 860;
        double countMin = 860 * 1.5;
        double attackRateLi = (warriorLi + archerLi + riderLi) * countLi;
        double attackRateMin = (warriorMin + archerMin + riderMin) * countMin;
        System.out.println("Overall attack rate of dynasty Li: " + attackRateLi);
        System.out.println("Overall attack rate of dynasty Min: " + attackRateMin);

    }
}
