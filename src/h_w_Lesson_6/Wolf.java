package h_w_Lesson_6;

public class Wolf extends Wild {

    public Wolf(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Wolf' " +
                " " +getSpeak()+
                ", " + wild +
                " " +getInPredator()+
                "";
    }
}
