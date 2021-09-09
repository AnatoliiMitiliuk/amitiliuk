package h_w_Lesson_6;

public class Fish extends Pet{

    public Fish(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Fish' " +
                " " +getSpeak()+
                ", .... .... .... " +getName()+
                "";
    }
}
