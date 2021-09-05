package h_w_Lesson_4;

public class Task11 {
    public static void main(String[] args) {

        int[] number = {4, -5, 0, 6, 8,};
        int nMin = 0;
        int nMax = 0;
        int min = number[0];
        int max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
                nMax = i;
            }
            if (number[i] < min) {
                min = number[i];
                nMin = i;
            }
        }
        number[nMin] = max;
        number[nMax] = min;

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
    }
}
