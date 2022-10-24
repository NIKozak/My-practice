public class Main {
    public static void main(String[] args) {

        Pizza pizzaPeperoni = new Pizza("Peperoni", 30, 450, "Round");
        pizzaPeperoni.getShop();
        Burger burgerTasty = new Burger("Tasty",300, "Big");
        burgerTasty.getShop();
        pizzaPeperoni.getShoptwo();
        burgerTasty.getShoptwo();
        System.out.println("_________________________________________________________________________");
        IFoodShoop burgerSmallpower = new Pizza("Margarita", 40, 800, "Round");
        burgerSmallpower.getShop();
        burgerSmallpower = new Burger("Smallpower",150, "Small");
        burgerSmallpower.getShop();
        //if(burgerSmallpower instanceof Pizza){
            String name = ((Burger)burgerSmallpower).getNamePizza();
            System.out.println(name);
        //}


    }
}
interface IFoodShoop {
    void getShop();
}
interface IFoodShoopTwo extends IFoodShoop {
    void getShoptwo();
}
class Pizza implements IFoodShoopTwo {
    private String name; int razmer; int ves;  String forma;
    Pizza(String name, int razmer, int ves, String forma) {
    this.name = name;
    this.razmer = razmer;
    this.ves = ves;
    this.forma = forma;
    }
    String getNamePizza() {
        return name;
    }
    public void getShop() {

        System.out.println(name+" "+razmer+"sm "+ves+"gr "+forma);

    }
    public void getShoptwo() {
        System.out.println("You ordered");
        System.out.println(name+" "+razmer+"sm "+ves+"gr "+forma);

    }
}
class Burger implements IFoodShoop {
    private String name; int ves; String size;
    Burger(String name, int ves, String size){
        this.name = name;
        this.ves = ves;
        this.size = size;
    }
    String getNamePizza() {
        return name;
    }
    public void getShop() {

        System.out.println(name+" "+ves+"gr "+size);

    }
    public void getShoptwo() {
        System.out.println("You ordered");
        System.out.println(name+" "+ves+"gr "+size);

    }


}



