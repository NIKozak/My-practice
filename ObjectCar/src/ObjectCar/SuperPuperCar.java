package ObjectCar;

public class SuperPuperCar extends Supercar {
    private double Weight;

    public SuperPuperCar(int speed, int overclocking, String color, double weight) {
        super(speed, overclocking, color);
        Weight = weight;
    }

    public double NeedForWeight() {
        return Weight;
    }

}
