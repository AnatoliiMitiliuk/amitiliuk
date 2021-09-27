package h_w_Lesson_9.Animals;

import h_w_Lesson_9.Animals.interfaces.Swim;

public class Cat extends Pet implements Swim {

    @Override
    public String swim() {
        return "I don't like swimming";
    }

    public Cat() {
    }

    @Override
    public String makeSpeak() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "'Cat' " + sayHello() +
                ", my name is " + getName() +
                ", " + makeSpeak() +
                ", " + swim() +
                "";
    }
}
