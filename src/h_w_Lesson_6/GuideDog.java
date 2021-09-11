package h_w_Lesson_6;

public class GuideDog extends Dog{

    public GuideDog() {}

    @Override
    public String speak(){
        return (super.speak().concat(", my name is"));
    }

    @Override
    public String toString() {
        return "'Guide Dog' " +speak()+
                " " + getName() +
                ", "  + woof+
                ", " + getIsTrained() +
                ".";
    }

}
