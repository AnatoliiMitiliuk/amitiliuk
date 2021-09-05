package h_w_Lesson_4;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         */
        String number = scanner.nextLine();
        int numberX = Integer.parseInt(number);

        int result;
        for (int i = 1; i <= 10; i++) {
            result = numberX * i;
            System.out.println(numberX + " * " + i + " = " + result);

        }
    }
}
