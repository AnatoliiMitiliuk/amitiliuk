package h_w_Lesson_6;


public class Cat extends Pet {

     String meow = "Meow";

    public Cat() {}

    @Override
    public String speak(){
        return (super.speak().concat(", my name is"));
    }

    @Override
    public String toString() {
        return "'Cat' " +speak()+
                " " +getName()+
                ", " + meow+
                ".";
    }
}
