package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите сумму денежного вклада в гривнах");
        String summaMoney = reader.readLine();

        System.out.println("Введите процент годовых");
        String percent = reader.readLine();

        System.out.println("Введите длительность вклада (лет)");
        String years = reader.readLine();


        double money = Double.parseDouble(summaMoney);
        long moneyTenner = (long) money * 10000;

        double pPercent = Double.parseDouble(percent);
        long percentTen = (long) (pPercent*10000);

        double percentMoney = moneyTenner*pPercent/100;

        int year = Integer.parseInt(years);


        long percentYar = 0;
        double interest;

        float moneyPrint;
        for (int iYear = 1; iYear <= year; iYear++) {

            percentYar += percentTen;
           interest = percentYar / 10000.0;

            moneyTenner = (long) (moneyTenner + percentMoney);
            moneyPrint = (float) (moneyTenner/10000.0);

            System.out.println("(накопленная сумма за "+iYear+"й год) "+moneyPrint+" (начисленные проценты) "+interest);
        }

    }
}
