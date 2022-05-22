import java.sql.SQLOutput;

public class ArtihmeticOperators {
    /*
        Tot ce scriem intre aceste vcaractere nu este compilat
        acesta este un comentariu multilinie
         */
    //Acesta este un comentariu pe o singura linie
    //Aceasta este metoda main care porneste o aplicatie java
    public static void main(String[] args) {
        //Operatorul de adunare +
        int sum = 5 + 4;
        //Aici vrem sa afism pe consola IntelJ un mesaj ales de noi
        System.out.println("Suma este: " + sum);

        //Operatorul de scadere -
        int difference = 10 -5;
        System.out.println("Diferenta este: " + difference);

        //Operatorul de inmultire
        int multiplication = 40 * 5;
        System.out.println("Inmultirea este: " + multiplication);

        //Modulo sau mod - %
        int mod = 150%43;
        System.out.println("Restul impartirii este: " + mod);
        //Div sau division - /
        int div = 150 / 43;
        System.out.println("Catul impartirii este: " + div);
    }
}
