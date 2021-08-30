package homework4;

public class Task12 {
    public static void main(String[] args) {

        int[] arrays = {4,8,16,18};
        double average;
        double sum = 0;
        for (int array : arrays) {
            sum += array;
        }
        average = sum/ arrays.length;
        System.out.println(average);

    }
}
