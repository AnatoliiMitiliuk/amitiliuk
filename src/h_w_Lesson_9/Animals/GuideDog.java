package h_w_Lesson_9.Animals;

public class GuideDog extends Dog {

    public GuideDog() {
    }

    @Override
    public String woof() {
        return "I can take you home";
    }

    @Override
    public String makeSpeak() {
        return "Woof";
    }

    @Override
    public String toString() {
        return "'Guide Dog' " + sayHello() +
                ", my name is " + getName() +
                ", " + makeSpeak() +
                ", " + woof() +
                ", " + swim() +
                "";
    }
}
