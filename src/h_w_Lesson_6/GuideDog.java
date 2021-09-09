package h_w_Lesson_6;

public class GuideDog extends Dog{

    public GuideDog(String speak) {
        super(speak);

    }

    @Override
    public String toString() {
        return "'Guide Dog' " +
                " " + getSpeak()+
                ", my name is " + getName() +
                ", "  + woof+
                ", " + getIsTrained() +
                "";
    }

}
