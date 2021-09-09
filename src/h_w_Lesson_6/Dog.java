package h_w_Lesson_6;

public class Dog extends Pet{

    String woof= "Woof";
    private String isTrained;

    public Dog(String speak) {
        super(speak);
    }

    public String getIsTrained() {
        return isTrained;
    }

    public void setIsTrained(String isTrained) {
        this.isTrained = isTrained;
    }

}
