package h_w_Lesson_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArraysAdd {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        addElements(arrayList);
        getRandomElements(arrayList);
        double finish = System.currentTimeMillis() - start;
        System.out.println(finish);

        start = System.currentTimeMillis();
        addElements(linkedList);
        getRandomElements(linkedList);
        finish = System.currentTimeMillis() - start;
        System.out.println(finish);

    }

    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(random.nextInt());
        }
    }

    public static void getRandomElements(List<Integer> list) {
        for (int i = 0; i < 10_000; i++) {
            list.get(random.nextInt(1_000_000));
        }
    }

}





