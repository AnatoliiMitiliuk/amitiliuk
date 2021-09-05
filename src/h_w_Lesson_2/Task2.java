package h_w_Lesson_2;

public class Task2 {
    public static void main(String[] args) {


        double[] numbers = {23, 54, 3, 567};

        double summa = 0;

        for (double s : numbers) {
            summa += s;
        }

        System.out.println(summa / numbers.length);

    }
}
