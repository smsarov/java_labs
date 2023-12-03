enum Companies {
    APPLE,
    GOOGLE,
    AMAZON
}

public class Main {

    public static void main(String[] args) {
        int integer = 5;
        short shrt = 4;
        byte bt = 20;
        char chr = 'a';
        String str = "Hello";
        Companies j = Companies.APPLE;


        printSwitch(integer,"integer");
        printSwitch(shrt,"short");
        printSwitch(bt,"byte");
        printSwitch(chr,"char");
        printSwitch(str,"string");
        printSwitch(j,"enum");
    }
    public static void printSwitch(int a, String name){
        String msg = "";
        switch(a)
        {
            case 16, 42 -> msg = name + " = " + a;
            default -> msg = "undefined";
        }
        System.out.println(msg);
    }

    public static void printSwitch(short a, String name){
        String msg = "";
        switch(a)
        {
            case 3, 8 -> msg = name + " = " + a;
            default -> msg = "undefined";
        }
        System.out.println(msg);
    }

    public static void printSwitch(String a, String name){
        String msg = "";
        switch(a)
        {
            case "Hello", "World" -> msg = name + " = " + a;
            default -> msg = "undefined";
        }
        System.out.println(msg);
    }

    public static void printSwitch(byte a, String name){
        String msg = "";
        switch(a)
        {
            case 19, 20 -> msg = name + " = " + a;
            default -> msg = "undefined";
        }
        System.out.println(msg);
    }

    public static void printSwitch(Companies a, String name){
        String msg = "";
        switch(a)
        {
            case APPLE, GOOGLE, AMAZON -> msg = name + " = " + a;
            default -> msg = "undefined";
        }
        System.out.println(msg);
    }

    public static void printSwitch(char a, String name){
        String msg = "";
        switch(a)
        {
            case 'a','b','c' -> msg = name + " = " + a;
            default -> msg = "undefined";
        }
        System.out.println(msg);
    }
}