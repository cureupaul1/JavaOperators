import java.sql.SQLOutput;

public class ArtihmeticOperators {
    /**
     * Metoda main este metoda apelata de masina virtuala Java si care porneste o aplicatie java
     * Putem transmite argumente aditionale prin parametrul <b>args</b>
     * @param args Acesta este parametrul cu care transmitem argumente programului nostru
     * Autor Paul Ioan
     */
    public static void main(String[] args) {
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
