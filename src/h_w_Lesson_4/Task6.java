package h_w_Lesson_4;

public class Task6 {
    public static void main(String[] args) {
        int number = 0;
        int i = 0;
        while (i < 10) {
            i++;
            number -= 5; // - неверно !!! 10 первых чисел, начиная с 0
            System.out.println(number);
            // number -=5; //  10 первых чисел, начиная с 0
        }
    }
}
