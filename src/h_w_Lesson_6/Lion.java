package h_w_Lesson_6;

public class Lion extends Wild{

    public Lion() {}

    @Override
    public String speak(){
        return (super.speak().concat(", "+wild));
    }

    @Override
    public String toString() {
        return "'Lion' " +speak()+
                " " +getInPredator()+
                ".";
    }
}
