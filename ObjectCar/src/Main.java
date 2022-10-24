import ObjectCar.*;


public class Main {
    public static void main(String[] args) {

        SuperPuperCar car =  new SuperPuperCar(300, 5,"red",1555.55);
        System.out.println(car.NeedForSpeed());
        System.out.println(car.NeedForOverclocking());
        System.out.println(car.NeedForColor());
        System.out.println(car.NeedForWeight());
    }
}







