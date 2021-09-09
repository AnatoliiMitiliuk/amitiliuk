package h_w_Lesson_6;

public class Giraffe extends Wild{

    public Giraffe(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Giraffe' " +
                " " + getSpeak()+
                ", " +wild+
                "";
    }
}
