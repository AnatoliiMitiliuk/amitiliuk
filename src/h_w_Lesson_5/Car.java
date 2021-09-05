package h_w_Lesson_5;

public class Car {
    private double fuelTank; //объем бака  -топливный бак 80 литров
    private double residualTank;  //остаток в баке 20 литров
    private double consumptionPer100; //расход топлива на 100 км 12л

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }
    public void setResidualTank(double residualTank) {
        this.residualTank = residualTank;
    }
    public void setConsumptionPer100(double consumptionPer100) {
        this.consumptionPer100 = consumptionPer100;
    }

    public double getFuelTank() {
        return fuelTank;
    }
    public double getResidualTank() {
        return residualTank;
    }
    public double getConsumptionPer100() {
        return consumptionPer100;
    }
    //долить до полного бака
    private double fullTank;

    public void setFullTank(double fullTank) {
        this.fullTank = fullTank;
    }
    public double getFullTank() {
        return fullTank;
    }
    // на сумму
    private double mane ;

    public void setMane(double mane) {
        this.mane = mane;
    }

    public double getMane() {
        return mane;
    }

}
