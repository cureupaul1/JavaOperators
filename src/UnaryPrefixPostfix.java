public class UnaryPrefixPostfix {
    public static void main(String[] args) {
        int number = 1;

        System.out.println(number++); //varianta postfixata - dupa operand
        System.out.println(number);
        System.out.println(++number); //varianta prefixata - inainte de operand
        System.out.println(number--);
        System.out.println(number);
        System.out.println(--number);
    }
}
