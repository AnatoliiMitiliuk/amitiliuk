package h_w_Lesson_9.Animals;

public class Wolf extends Wild {

    public Wolf() {
    }

    @Override
    public String toString() {
        return "'Wolf' " + sayHello() +
                ", " + makeSpeak() +
                " " + saySpeakWild() +
                "";
    }
}
