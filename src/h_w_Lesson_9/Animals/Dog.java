package h_w_Lesson_9.Animals;

import h_w_Lesson_9.Animals.interfaces.Swim;
import h_w_Lesson_9.Animals.interfaces.Woof;

public class Dog extends Pet implements Woof, Swim {

    @Override
    public String swim() {
        return Swim.super.swim();
    }

    @Override
    public String woof() {
        return null;
    }

    public Dog() {
    }
}
