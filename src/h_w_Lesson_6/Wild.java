package h_w_Lesson_6;

public class Wild extends Animals {

    String wild = "I am a wild animal";
    String inPredator;

    public Wild(String speak) {
        super(speak);
    }

    public String getInPredator() {
        return inPredator;
    }

    public void setInPredator(String inPredator) {
        this.inPredator = inPredator;
    }
}
