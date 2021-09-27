package h_w_Lesson_9.Animals;

import h_w_Lesson_9.Animals.interfaces.Swim;

public class Fish extends Pet implements Swim {

    @Override
    public String swim() {
        return "....";
    }

    @Override
    public String sayHello() {
        return "....";
    }

    @Override
    public String toString() {
        return "'Fish' " + sayHello() +
                " " +
                ", .... .... .... " + getName() +
                ", " + swim() +
                "";
    }
}
