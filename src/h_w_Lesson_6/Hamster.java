package h_w_Lesson_6;

public class Hamster extends Pet{

    public Hamster(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Hamster' " +
                " " +getSpeak()+
                ", my name is " +getName()+
                "" +
                "";
    }
}
