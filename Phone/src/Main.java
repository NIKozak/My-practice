public class Main {
    public static void main(String[] args) {

        Phone MyPhoneOne = new Phone("+3809300000","Samsung",200);
        Phone MyPhoneTwo = new Phone("+3806300000","Xiaomi",250);
        Phone MyPhoneTree = new Phone("+30806600000","Iphone",180);
        MyPhoneOne.Info();
        MyPhoneTwo.Info();
        MyPhoneTree.Info();
        System.out.print("------------------------------------------------------------- \n");
        MyPhoneOne.receiveCall("Ivan");
        System.out.print(MyPhoneOne.getNumber()+"\n");
        MyPhoneTwo.receiveCall("Petro");
        System.out.print(MyPhoneTwo.getNumber()+"\n");
        MyPhoneTree.receiveCall("Vasia");
        System.out.print(MyPhoneTree.getNumber()+" \n");
        System.out.print("-------------------------------------------------------------- \n");
        Phone MyPhoneOneParametr = new Phone("+3806600000","Huavey \n");
        Phone MyPhoneTwoParametr = new Phone("+3804400000","Poco \n");
        Phone MyPhoneTreeParametr = new Phone("+3808800000","Alcatel \n");
        MyPhoneOneParametr.Info();
        MyPhoneTwoParametr.Info();
        MyPhoneTreeParametr.Info();
        System.out.print("------------------------------------------------------------------ \n");
        Phone MyPhoneOneNullParametr = new Phone();
        Phone MyPhoneTwoNullParametr = new Phone();
        Phone MyPhoneTreeNullParametr = new Phone();
        MyPhoneOneNullParametr.Info();
        MyPhoneTwoNullParametr.Info();
        MyPhoneTreeNullParametr.Info();
        System.out.print("------------------------------------------------------------------ \n");
        Phone MyPhoneNameOne = new Phone();
        Phone MyPhoneNameTwo = new Phone();
        Phone MyPhoneNameTree = new Phone();
        MyPhoneNameOne.receiveCall("Ivan");
        MyPhoneNameTwo.receiveCall("Petro");
        MyPhoneNameTree.receiveCall("Vasia");
        MyPhoneOne.receiveCall("Ivan","3802200000");
    }
}
class Phone {
    private String Number;
    private String Model;
    private int Weight;
    private String Name;
    Phone (String number, String model, int weight) {
        this(number, model);
        //Number=number;
        //Model=model;
        Weight=weight;

    }
    Phone (String number, String model) {
        Number=number;
        Model=model;
    }
    Phone (){

    }
    void Info(){
        System.out.print("Number " + Number + "\nModel "+ Model + "\nWeight " + Weight + "\n" );
    }
    public void receiveCall(String name){
        Name = name;
        System.out.printf("Call " + Name + "\n");

    }
    public void receiveCall(String name, String number ) {

        System.out.println(name + " " + number);
    }
    public String getNumber() {
        return Number;
    }


}