package h_w_Lesson_9.Car;

public class CarV9 {

    private String location = "Одесса" ;
    private double moneySpent;
    private double tankCapacity = (Math.random()*31)+30;
    private int consumptionPer100km = (int) (Math.random()*11)+5;
    private double fuel = (Math.random()*41)+10;
    private double fuelInTank = tankCapacity / 100.0 * fuel;
    private double tripDistance;

    public CarV9(String location) {
        this.location = location;
    }

    public void fillFullTank(double price) {
        System.out.println("Заправляем полный бак");
        fillTank(availableSpaceInTank(), price);

    }
    public void fillTank(double liters, double price) {
        double maxToFill = availableSpaceInTank();
        if (liters > maxToFill){
            liters = maxToFill;
        }
        System.out.printf("Заправляем %.0f литров. Оплачено %.2f грн. \n", liters, liters * price);
        fuelInTank +=liters;
        moneySpent += liters *fuelInTank;
    }

    public void drive(int distance, String destination) throws RuntimeException{
        System.out.printf("Едем в %s. %s км ... \n", destination , distance);
        fuelInTank -= distance / 100.0 * consumptionPer100km;
        if (fuelInTank < 0) {
            throw new RuntimeException("закончился бензин!");
        }
        tripDistance += distance;
    }

    public void printTripReport() {
        System.out.println("-------Отчет o поездке--------");
        System.out.printf(
                "Остаток топлива в баке %.0f литров. Всего проехали %.0f км. Всего потрачено %.2f грн. \n",
                getFuelInTank(),
                tripDistance,
                moneySpent);

    }

    private double availableSpaceInTank(){
        return tankCapacity-fuelInTank;
    }

    public double getFuelInTank() {
        return fuelInTank;
    }

    public void setTripDistance(double tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String toString() {
        return "CarV9{" +
                "location='" + location +
                ", tankCapacity=" + tankCapacity +
                ", consumptionPer100km=" + consumptionPer100km +
                ", fuel=" + fuel +
                ", fuelInTank=" + fuelInTank +
                '}';
    }

}
