package h_w_Lesson_9.Animals;

public class Lion extends Wild {

    public Lion() {
    }

    @Override
    public String toString() {
        return "'Lion' " + sayHello() +
                ", " + makeSpeak() +
                ", " + saySpeakWild() +
                "";
    }
}
