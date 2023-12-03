// логических операци1 && || !
// тернарной операции x < y ? x : y
// поразрядных логических операций & | ^ ~
// операции сдвига >> << >>>


public class Main {
    public static void main(String[] args) {
        LogicOperations();
        TernaryOperator();
        BitwiseOperations();
        ShiftOperations();

    }

    public static void LogicOperations(){
        System.out.println("true && false: " + (true && false));
        System.out.println("true && true: " + (true && true));
        System.out.println("false && false: " + (false && false));

        System.out.println("true || false: " + (true || false));
        System.out.println("true || true: " + (true || true));
        System.out.println("false || false: " + (false || false));

        System.out.println("! false: " + (!false));
        System.out.println("! true: " + (!true));
    }

    public static void TernaryOperator(){
        double PI = 3.1415926;
        System.out.println(PI > 3 ? "PI is bigger than 3" : "PI is less than 3");
        System.out.println(PI > 4 ? "PI is bigger than 4" : "PI is less than 4");
    }

    public static void BitwiseOperations(){
        int num1 = 6, num2 = 10;
        System.out.println(num1 + " is " + Integer.toBinaryString(num1) + " in binary");
        System.out.println(num2 + " is " + Integer.toBinaryString(num2) + " in binary");

        int bitwiseMultiplication = num1 & num2;
        int bitwiseAddition = num1 | num2;
        int bitwiseNot = ~num1;
        int xor = num1 ^ num2;

        System.out.println("bitwise multiplication: " + num1 + '&' + num2 + '=' + bitwiseMultiplication
                + '(' + Integer.toBinaryString(bitwiseMultiplication) + " in binary)");
        System.out.println("bitwise addition: " + num1 + '|' + num2 + '=' + bitwiseAddition
                + '(' + Integer.toBinaryString(bitwiseAddition) + " in binary)");
        System.out.println("bitwise not of " + num1 + " is " + bitwiseNot
                + '(' + Integer.toBinaryString(bitwiseNot) + " in binary)");
        System.out.println("xor: " + num1 + '^' + num2 + '=' + xor
                + '(' + Integer.toBinaryString(xor) + " in binary)");

    }

    public static void ShiftOperations(){
        int num = 24;
        System.out.println(num + " is " + Integer.toBinaryString(num) + " in binary");
        System.out.println(-num + " is " + Integer.toBinaryString(-num) + " in binary");
        int shift = 2;
        System.out.println(num + " << " + shift + " = " + (num << shift) + '(' + Integer.toBinaryString(num << shift) + " in binary)");
        System.out.println(num + " >> " + shift + " = " + (num >> shift) + '(' + Integer.toBinaryString(num >> shift) + " in binary)");
        System.out.println(-num + " >> " + shift + " = " + (-num >> shift) + '(' + Integer.toBinaryString(-num >> shift) + " in binary)");

        System.out.println(num + " >>> " + shift + " = " + (num >>> shift) + '(' + Integer.toBinaryString(num >>> shift) + " in binary)");
        System.out.println(-num + " >>> " + shift + " = " + (-num >>> shift) + '(' + Integer.toBinaryString(-num >>> shift) + " in binary)");
    }
}