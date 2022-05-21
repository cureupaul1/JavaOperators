
//Operatorii unari sunt operatorii care au un singur operand
public class UnaryOperators {
    public static void main(String[] args) {
        //Unari plus operator
        int number = +10;
        System.out.println("Valoarea este: " + number);

        number = -3;
        System.out.println("Valoarea este: " + number);
        number = -number;
        System.out.println("Valoarea este: " + number);

        number++; //incrementez cu 1 valoarea variabilii mele
        System.out.println("Valoarea este: " + number);

        //Operatorul de decrementare --
        number--;
        System.out.println("Valoarea este: " + number);

        //Operatorul de negare reprezentat prin semnul exclamarii
        boolean notOperator = true;
        notOperator = !notOperator;
        System.out.println("Valoarea este: " + notOperator);


    }
}
