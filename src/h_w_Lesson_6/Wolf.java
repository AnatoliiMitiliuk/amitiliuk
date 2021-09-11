package h_w_Lesson_6;

public class Wolf extends Wild {

    public Wolf() {}

    @Override
    public String speak(){
        return (super.speak().concat(", "+wild));
    }

    @Override
    public String toString() {
        return "'Wolf' " +speak()+
                " " +getInPredator()+
                ".";
    }
}
