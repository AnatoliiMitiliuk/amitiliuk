package h_w_Lesson_6;


public class Cat extends Pet {

     String meow = "Meow";

    public Cat(String speak) {
        super(speak);
    }

    @Override
    public String toString() {
        return "'Cat' " +
                " " + getSpeak()+
                ", my name is " +getName()+
                ", " + meow+
                "";
    }
}
