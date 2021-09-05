package h_w_Lesson_4;

public class Task5 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        /*-  неверно ^ - это оператор XOR. в задании имелось в виду возведение в степень через Math.pow(x,n)
        int illation = x ^ n;
        System.out.println(illation);
        System.out.println(Integer.toBinaryString(illation));
         */

        System.out.println(String.format("number %d в степени %d равно %s", x, n, Math.pow(x, n)));


    }
}
