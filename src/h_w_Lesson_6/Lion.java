package h_w_Lesson_6;

public class Lion extends Wild{

    public Lion(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Lion' " +
                " " +getSpeak()+
                ", " + wild +
                ", " +getInPredator()+
                "";
    }
}
