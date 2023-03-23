package MyProject;

public class ShuttleNumbers {
    public static void main(String[] args) {
       /*----------------------вариант 1------------
        int[] arrayShuttle = new int[100];
        int number = 1;
        for (int i = 0; i < 100; i++) {
            if ((number != 4) & (number != 9) & ((number % 10) != 4) & ((number % 10) != 9) &
               ((number < 40) || (number > 49)) & ((number < 90) || (number > 99)) &
               ((number < 140) || (number > 149))) {
                arrayShuttle[i] = number;
                number++;
            } else {
                number++;
                i--;
            }
        }
        System.out.print("numbers - ");
        for (int z : arrayShuttle) {
            System.out.print(z);
            System.out.print(", ");
        }
        /*------------вариант 2--------------------------------------*/
        String[] arrayShuttle = new String[100];
        int number = 1;
        for (int i = 0; i < 100; i++) {
            String numbers = String.valueOf(number);
            if (numbers.contains("4") || numbers.contains("9")) {
                number++;
                i--;
            } else {
                arrayShuttle[i] = numbers;
                number++;
            }
        }
        System.out.print("numbers - ");
        for (String num : arrayShuttle) {
            System.out.print(num);
            System.out.print(", ");
        }
    }
}
