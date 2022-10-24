import java.util.Scanner;

public class Main {
    public static int ShowMainMenu() {
        String text = """ 
                PROGRAMA TIPICHNOGO JAVISTA,
                1 Matemat operasii
                2 Rabota so strokami
                3 Rabota s masivamy
                """;
        System.out.println(text);
        Scanner in1 = new Scanner(System.in);
        System.out.print("oberite znachenie ot 1-3: ");
        return in1.nextInt();
    }

    public static void MathOperations() {
        System.out.println("Vy obraly 1 Matemat operasii");
        String text1 = """ 
                Yaku matemat operasii obyrayete
                1 Dodavaniya
                2 Vidnimaniya
                3 Dileniya
                4 Mnojeniya
                """;
        System.out.println(text1);

        Scanner in2 = new Scanner(System.in);
        System.out.print("oberite znachenie ot 1-4: ");
        int number2 = in2.nextInt();
        Scanner Num1 = new Scanner(System.in);
        Scanner Num2 = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        switch (number2) {
            case 1:
                System.out.println("Vy obraly Dodavaniya");
                System.out.print("Pervoe shislo ");
                num1 = Num1.nextInt();
                System.out.print("Vtoroe shislo ");
                num2 = Num2.nextInt();
                num3 = num1 + num2;
                System.out.println("Vidpovid " + num3);
                break;
            case 2:
                System.out.println("Vy obraly Vidnimaniya");
                System.out.print("Pervoe shislo ");
                num1 = Num1.nextInt();
                System.out.print("Vtoroe shislo ");
                num2 = Num2.nextInt();
                num3 = num1 - num2;
                System.out.println("Vidpovid " + num3);
                break;
            case 3:
                System.out.println("Vy obraly Dileniya");
                System.out.print("Pervoe shislo ");
                num1 = Num1.nextInt();
                System.out.print("Vtoroe shislo ");
                num2 = Num2.nextInt();
                if(num1 != 0 && num2 != 0){
                    num3 = num1 / num2;
                    System.out.println("Vidpovid " + num3);
                }
                else {
                    System.out.println("Na 0 delit nelzia povtorite zapros");
                }
                break;
            case 4:
                System.out.println("Vy obraly Mnojeniya");
                System.out.print("Pervoe shislo ");
                num1 = Num1.nextInt();
                System.out.print("Vtoroe shislo ");
                num2 = Num2.nextInt();
                num3 = num1 * num2;
                System.out.println("Vidpovid " + num3);
                break;
            default:
                System.out.println("Ne vernuy vvod Dalbayob dopusk 1,2,3,4");
        }
    }

    public static void RabStrok() {
        System.out.println("Vy obraly 2 Rabota so strokami");
        String text1 = """ 
                Rabota so strokami
                1 Perevod v nishniy registr
                2 Perevod v verhniy registr
                3 Zamena mestami
                """;
        System.out.println(text1);

        Scanner in3 = new Scanner(System.in);
        Scanner in4 = new Scanner(System.in);
        System.out.print("oberite znachenie ot 1-3: ");
        int number3 = in3.nextInt();

        if (number3 == 1) {
            System.out.println("Vy obraly Perevod v nishniy registr ");
            System.out.print("Vvedite stroku ");
            String stroka = in4.nextLine();
            System.out.print("Izmeneno na : ");
            System.out.println(stroka.toLowerCase());
        } else if (number3 == 2) {
            System.out.println("Vy obraly Perevod v verhniy registr ");
            System.out.print("Vvedite stroku ");
            String stroka = in4.nextLine();
            System.out.print("Izmeneno na : ");
            System.out.println(stroka.toUpperCase());
        } else if (number3 == 3) {
            System.out.println("Vy obraly Zamena mestami ");
            System.out.print("Vvedite 2 slova ");
            String stroka = in4.nextLine();
            String[] strokaaa = stroka.split(" ");
            System.out.println("Izmeneno na : " + strokaaa[1] + " " + strokaaa[0]);
        } else {
            System.out.println("Ne vernuy vvod Dalbayob dopusk 1,2,3");
        }

    }

    public static void RabMass() {
        System.out.println("Vy obraly 3 Rabota s masivamy");
        String text1 = """ 
                Rabota s masivamy
                1 Udalit element
                2 Dobavit element
                3 Zamenit element
                """;
        System.out.println(text1);
        Scanner in5 = new Scanner(System.in);
        System.out.print("oberite znachenie ot 1-3: ");
        int A = in5.nextInt();

        switch (A) {
            case 1:
                System.out.println("Vy obraly Udalit element ");
                System.out.println("Oberit razmer masiva ");
                int ma = in5.nextInt();
                System.out.println("Zapolnite masiv ");
                int[] mas = new int[ma];
                for (int i = 0; i < ma; i++) {
                    mas[i] = in5.nextInt();
                }
                System.out.println("Vash masiv ");
                for (int i = 0; i < ma; i++) {
                    System.out.print(mas[i] + " ");
                }
                System.out.println("Oberit element kotoruy udolit ot 1 do " + ma);
                int ms = in5.nextInt();

                for (int i = ms - 1; i < ma - 1; i++) {
                    mas[i] = mas[i + 1];
                }
                System.out.println("Vach novuy masiv ");
                for (int i = 0; i < ma - 1; i++) {
                    System.out.print(mas[i] + " ");
                }
                break;
            case 2:
                System.out.println("Vy obraly Dobavit element ");
                System.out.println("Oberit razmer masiva ");
                ma = in5.nextInt();
                System.out.println("Zapolnite masiv ");
                int text = ma;
                int[] mam = new int[ma + 1];
                for (int i = 1; i <= ma; i++) {
                    mam[i] = in5.nextInt();
                }
                System.out.println("Vash masiv ");
                for (int i = 1; i <= ma; i++) {
                    System.out.print(mam[i] + " ");
                }
                System.out.println("Oberit mesto sprava shisla kotoruy dobavith ot 1 do " + text + " are " + ma + " esli sleva ot 1 ");
                ms = in5.nextInt();
                System.out.println("Vvedite element dliya dobavleniya");
                int el = in5.nextInt();
                if (ms < ma) {
                    for (int i = 0; i <= ms; i++) {
                        mam[i] = mam[i + 1];
                    }
                    mam[ms] = el;
                    System.out.println("Vach novuy masiv ");
                    for (int i = 0; i <= ma; i++) {
                        System.out.print(mam[i] + " ");
                    }
                } else {
                    mam[0] = el;
                    for (int i = 0; i <= ma; i++) {
                        System.out.print(mam[i] + " ");
                    }
                }
                break;
            case 3:
                System.out.println("Vy obraly Zamenit element ");
                System.out.println("Oberit razmer masiva ");
                ma = in5.nextInt();
                System.out.println("Zapolnite masiv ");
                int[] mar = new int[ma];
                for (int i = 0; i < ma; i++) {
                    mar[i] = in5.nextInt();
                }
                System.out.println("Vash masiv ");
                for (int i = 0; i < ma; i++) {
                    System.out.print(mar[i] + " ");
                }
                System.out.println("oberit elemen kotory nugno zamenit ot 1 do " + ma);
                int za = in5.nextInt();
                System.out.println("VVedite element dliya zameny ");
                int zam = in5.nextInt();
                mar[za - 1] = zam;
                System.out.println("Vach novuy masiv ");
                for (int i = 0; i < ma; i++) {
                    System.out.print(mar[i] + " ");
                }
                break;
            default:
                System.out.println("Ne vernuy vvod Dalbayob dopusk 1,2,3");
        }
    }

    public static void main(String[] args) {
        int number1 = ShowMainMenu();
        switch (number1) {
            case 1:
                MathOperations();
                break;
            case 2:
                RabStrok();
                break;
            case 3:
                RabMass();
                break;
            default:
                System.out.println("Ne vernuy vvod Dalbayob dopusk 1,2,3");
        }
    }
}