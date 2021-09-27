package h_w_Lesson_9.Animals;

import h_w_Lesson_9.Animals.interfaces.Speak;

public class Pet implements Speak {

    @Override
    public String makeSpeak() {
        return null;
    }

    @Override
    public String sayHello() {
        return Speak.super.sayHello();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
