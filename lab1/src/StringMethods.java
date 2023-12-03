public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";

        //Methods to get the information about the string
        System.out.println("String length: " + str.length());
        System.out.println("Symbol by index 7: " + str.charAt(7));
        System.out.println("Index of the first occurrence of symbol 'l': " + str.indexOf('l'));
        System.out.println("Index of the last occurrence of symbol 'l': " + str.lastIndexOf('o'));
        System.out.println("Substring from index to 2 to index 4 " + str.substring(2, 4));

        //Methods to get modified strings
        System.out.println("Uppercase version: " + str.toUpperCase());
        System.out.println("Lowercase version: " + str.toLowerCase());
        System.out.println("Version with no prefix and postfix spaces " + str.trim());

        //String comparison
        String str1 = "123A";
        String str2 = "123a";
        System.out.println("Comparison with respect to register: " + str1.equals(str2));
        System.out.println("Comparison without respect to register: " + str1.equalsIgnoreCase(str2));

        //Check content of the string
        System.out.println("Starts with symbol '1': " + str1.startsWith("1"));
        System.out.println("Ends with symbol 'a': " + str1.endsWith("a"));
        System.out.println("Contains '23' substring: " + str1.contains("23"));

        //String addition
        String firstString = "Hello";
        String secondString = "World";
        String combined = firstString + " " + secondString;
        System.out.println("combined: " + combined);

        //String addition with other data types
        int num = 10;
        String result = "my string" + num;
        System.out.println(result);

        //null definition
        String nullString = null;
        System.out.println("result is null: " + (result == null));
        System.out.println("nullString is null: " + (nullString == null));

    }
}