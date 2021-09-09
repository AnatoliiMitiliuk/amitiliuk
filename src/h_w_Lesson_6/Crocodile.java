package h_w_Lesson_6;

public class Crocodile extends Wild{

    public Crocodile(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Crocodile' " +
                " " +getSpeak()+
                ", " + wild +
                ", " +getInPredator()+
                "";
    }
}
