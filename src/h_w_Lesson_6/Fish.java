package h_w_Lesson_6;

public class Fish extends Pet{

    public Fish() {}

    @Override
    public String speak(){
        return ("....".concat(", .... .... ...."));
    }

    @Override
    public String toString() {
        return "'Fish' " +speak()+
                ", " +getName()+
                ".";
    }
}
