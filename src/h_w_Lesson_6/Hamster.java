package h_w_Lesson_6;

public class Hamster extends Pet{

    public Hamster() {}

    @Override
    public String speak(){
        return (super.speak().concat(", my name is"));
    }

    @Override
    public String toString() {
        return "'Hamster' " +speak()+
                " " +getName()+
                ".";
    }
}
