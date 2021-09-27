package h_w_Lesson_9.Animals;

import h_w_Lesson_9.Animals.interfaces.Swim;

public class Crocodile extends Wild implements Swim {

    @Override
    public String swim() {
        return Swim.super.swim();
    }

    public Crocodile() {
    }

    @Override
    public String toString() {
        return "'Crocodile' " + sayHello() +
                ", " + makeSpeak() +
                ", " + saySpeakWild() +
                ", " + swim() +
                "";
    }
}
