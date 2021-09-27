package h_w_Lesson_9.Animals;

public class Giraffe extends Wild {

    public Giraffe() {
    }

    @Override
    public String toString() {
        return "'Giraffe' " + sayHello() +
                ", " + makeSpeak() +
                "";
    }
}
