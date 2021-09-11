package h_w_Lesson_6;

public class Crocodile extends Wild{

    public Crocodile() {}

    @Override
    public String speak(){
        return (super.speak().concat(", "+wild));
    }

    @Override
    public String toString() {
        return "'Crocodile' " +speak()+
                ", " +getInPredator()+
                ".";
    }
}
