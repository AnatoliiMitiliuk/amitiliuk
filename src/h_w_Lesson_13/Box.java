package h_w_Lesson_13;

import java.util.Random;

public class Box {
    private int weight;
    Random random = new Random();

    public Box(){
        this.weight = random.nextInt(1000);
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() {

        return "Box{" +
                "weight=" + weight +
                '}';
    }
}
