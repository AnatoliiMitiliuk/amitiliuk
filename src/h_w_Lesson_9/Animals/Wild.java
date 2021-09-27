package h_w_Lesson_9.Animals;

import h_w_Lesson_9.Animals.interfaces.Speak;

public class Wild implements Speak {

    @Override
    public String makeSpeak() {
        return "I am a wild animal";
    }

    @Override
    public String sayHello() {
        return Speak.super.sayHello();
    }

    public Wild() {
    }
}
