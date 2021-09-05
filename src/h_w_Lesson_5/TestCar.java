package h_w_Lesson_5;

import java.util.Scanner;

public class TestCar extends Car {
    public static void main(String[] args) {

        int toKrOz = 178;
        int toZhashkiv = 325; //328
        int toKyiv = 478;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Предлагаемый маршрут: Одесса-Киев " + toKyiv + ".");
        System.out.println("две обязательные остановки для дозаправки");
        System.out.println("1 остановка: Кривое Озеро через " + toKrOz + ".");
        System.out.println("2 остановка: Жашков через " + toZhashkiv + ".");

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("введите объем бака, ");
        double fTank = Double.parseDouble(scanner.nextLine());

        System.out.println("введите остаток топлива в баке, ");
        double residual = Double.parseDouble(scanner.nextLine());

        System.out.println("введите расход на 100 км");
        double consumption = Double.parseDouble(scanner.nextLine());

        System.out.println("введите цену на топлива ");
        double moneyF = Double.parseDouble(scanner.nextLine());

        Car car = new Car();
        car.setFuelTank(fTank);
        car.setConsumptionPer100(consumption);
        car.setResidualTank(residual);

        int toKrOz1 = toKrOz; // расстояние Озеро
        int toZhashkiv2 = (int) minus(toZhashkiv, toKrOz1); // Жашков
        int toKyiv3 = (int) minus(toKyiv, toZhashkiv); // Киев

        double fuilKrOz = fff(car.getConsumptionPer100(), toKrOz1); //--топлива Озеро
        double fuilZhashkiv = fff(car.getConsumptionPer100(), toZhashkiv2); //--топлива Жашков
        double fuilKyiv = fff(car.getConsumptionPer100(), toKyiv3); //--топлива Киев

        System.out.println("на заправке перед поездкой");

        car.setFullTank(minus(car.getFuelTank(), car.getResidualTank()));
        car.setMoney(productСardinals(car.getFullTank(), moneyF));
        System.out.println("долить до полного бака " + car.getFullTank() + " л на сумму " + car.getMoney());

        System.out.println("-------------------------------------------------------");

        System.out.println("1 остановка: Кривое Озеро проехали - " + toKrOz1 + "км. из Одессы");

        car.setResidualTank(minus(car.getFuelTank(), fff(car.getConsumptionPer100(), toKrOz1)));

        System.out.println("остаток топлива " + car.getResidualTank() + "л");
        car.setFullTank(minus(car.getFuelTank(), car.getResidualTank()));
        car.setMoney(productСardinals(car.getFullTank(), moneyF));
        System.out.println("долить топлива " + car.getFullTank() + " л на сумму " + car.getMoney() + "грн.");

        System.out.println("-------------------------------------------------------");
        System.out.println("2 остановка: Жашков проехали - " + toZhashkiv2 + "км. от Кривого Озера");

        car.setResidualTank(minus(car.getFuelTank(), fff(car.getConsumptionPer100(), toZhashkiv2)));

        System.out.println("остаток топлива " + car.getResidualTank() + "л");
        car.setFullTank(minus(car.getFuelTank(), car.getResidualTank()));
        car.setMoney(productСardinals(car.getFullTank(), moneyF));
        System.out.println("долить топлива " + car.getFullTank() + " л на сумму " + car.getMoney() + "грн.");

        System.out.println("-------------------------------------------------------");
        System.out.println("приехали: Киев - " + toKyiv3 + "км. от Жашкова");

        car.setResidualTank(minus(car.getFuelTank(), fff(car.getConsumptionPer100(), toKyiv3)));

        System.out.println("остаток топлива " + car.getResidualTank() + "л");
        car.setFullTank(minus(car.getFuelTank(), car.getResidualTank()));
        int drive = toKrOz1 + toZhashkiv2 + toKyiv3;
        double fuel = fff(car.getConsumptionPer100(), drive);
        car.setMoney(productСardinals(fuel, moneyF));
        System.out.println("-------------------------------------------------------");
        System.out.println("Одесса-Киев " + drive + "км.");
        System.out.println("израсходовали топлива " + fuel + "л. на сумму " + car.getMoney() + "грн.");
    }

    static double productСardinals(double a, double b) {
        return a * b;
    }
    static double plus(double a, double b) {
        return a + b;
    }
    static double minus(double a, double b) {
        return a - b;
    }
    //расход
    static double fff(double d, int c) {
        return (d * c) / 100;
    }
}
