package MyProject;

import java.util.Arrays;
public class Lottery {
    public static void main(String[] args) {
        int[] arrayFirst = new int[7];
        int[] arraySecond = new int[7];
        for (int i = 0; i < 7; i++) {
            arrayFirst[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 7; i++) {
            arraySecond[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < arrayFirst.length; i++) {
            int pos = i;
            int min = arrayFirst[i];
            for (int j = i + 1; j < arrayFirst.length; j++) {
                if (arrayFirst[j] < min) {
                    pos = j;
                    min = arrayFirst[j];
                }
            }
            arrayFirst[pos] = arrayFirst[i];
            arrayFirst[i] = min;
        }
        System.out.println(Arrays.toString(arrayFirst));
        for (int i = 0; i < arraySecond.length; i++) {
            int pos = i;
            int min = arraySecond[i];
            for (int j = i + 1; j < arraySecond.length; j++) {
                if (arraySecond[j] < min) {
                    pos = j;
                    min = arraySecond[j];
                }
            }
            arraySecond[pos] = arraySecond[i];
            arraySecond[i] = min;
        }
        System.out.println(Arrays.toString(arraySecond));
        int coin = 0;
        for (int i = 0; i < 7; i++) {
            if (arrayFirst[i] == arraySecond[i]) {
                coin++;
            }
        }
        System.out.println();
        System.out.print("number of coincidences: " + coin);
    }
}
