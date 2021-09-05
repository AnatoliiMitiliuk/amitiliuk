package h_w_Lesson_4;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 2*i+1;
        }
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i]+",");

        }
    }
}
