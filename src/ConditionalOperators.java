public class ConditionalOperators {
    public static void main(String[] args) {
        int a= 5;
        int b = 10;
        //&& - si logic
        // || -sau logic
        System.out.println("(a == 5) && (b == 7)-> "+((a == 5) && (b == 7)));
        System.out.println("(a == 5) && (b == 10)-> "+((a == 5) && (b == 10)));

        System.out.println("(a == 5) || (b == 7)-> "+((a == 5) || (b == 7)));
        System.out.println("(a == 3) || (b == 11)-> "+((a == 3) || (b == 11)));
        /*
        true && true -> true
        true && false -> false
        false && true -> false
        false & false -> false
         */
    }
}
