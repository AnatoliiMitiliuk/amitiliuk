package h_w_Lesson_9.Animals.interfaces;

public interface Speak {

    String makeSpeak();

    default String sayHello() {
        return "Hello";
    }

    default String saySpeakWild() {
        return "and I am angry";
    }
}
