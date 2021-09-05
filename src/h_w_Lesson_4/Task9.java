package h_w_Lesson_4;

public class Task9 {
    public static void main(String[] args) {
        int[] number = {4, -5, 0, 6, 8,};
        int min = number[0];
        for (int i : number) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
