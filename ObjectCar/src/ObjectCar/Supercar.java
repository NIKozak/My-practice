package ObjectCar;

public class Supercar {
    protected int Speed;
    protected int Overclocking;
    protected String Color;

    public Supercar(int speed, int overclocking, String color) {
        Speed = speed;
        Overclocking = overclocking;
        Color = color;
    }
    public int NeedForSpeed() {
        return Speed;
    }

    public int NeedForOverclocking() {
        return Overclocking;
    }

    public String NeedForColor() {
        return Color;
    }
}
