package h_w_Lesson_7;

import java.math.BigDecimal;
import java.util.Scanner;
import static java.math.RoundingMode.HALF_UP;

public class DepositCalculatorToRefactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        BigDecimal sum = sc.nextBigDecimal();
        System.out.print("Какой процент годовых? ");
        BigDecimal percent = sc.nextBigDecimal();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            BigDecimal y = sum.divide(BigDecimal.valueOf(100)).multiply(percent);
            y = y.setScale(2, HALF_UP);
            sum = sum.add(y);

            int t = i % 10;
            int h = i % 100;

            String yar = "год";
            if (h >= 10 && h <= 20) {
                yar = "лет";
            } else if (t >= 2 && t <= 4) {

                yar = "года";
            } else if (t == 0 || t >= 5) {
                yar = "лет";
            }

            System.out.println("Накопленная сумма за " + i + " " + yar + " составила: " + sum);
            System.out.println("Начисленные проценты в грн: " + y);
            System.out.println("-------");

        }

    }

}


