import java.sql.SQLOutput;

public class ArtihmeticOperators {
    /*
        Tot ce scriem intre aceste vcaractere nu este compilat
        acesta este un comentariu multilinie
         */
    //Acesta este un comentariu pe o singura linie
    //Aceasta este metoda main care porneste o aplicatie java
    public static void main(/* Args este parametru metodei main*/String[] args) {
        //Operatorul de adunare +
        int sum = 5 + 4;
        /*
        Textul de aici face
        parte tot din comentariu multi-linie
         */
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
