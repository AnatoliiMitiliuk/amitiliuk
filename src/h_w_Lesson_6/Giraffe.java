package h_w_Lesson_6;

public class Giraffe extends Wild{

    public Giraffe() {}

    @Override
    public String speak(){
        return (super.speak().concat(", "+wild));
    }
    @Override
    public String toString() {
        return "'Giraffe' " +speak()+
                ".";
    }
}
