package h_w_Lesson_6;

public class Pet extends Animals {

    private String name;

    private String isVaccinated;

    public Pet(String speak) {
        super(speak);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(String isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
}
