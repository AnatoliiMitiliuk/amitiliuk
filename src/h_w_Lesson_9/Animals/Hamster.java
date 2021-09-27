package h_w_Lesson_9.Animals;

public class Hamster extends Pet {

    public Hamster() {
    }

    @Override
    public String toString() {
        return "'Hamster' " + sayHello() +
                ", my name is " + getName() +
                "";
    }
}
