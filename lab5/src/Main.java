
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No argument found");
            return;
        }
        
        System.out.println("arguments are: ");
        for(int i = 0; i < args.length; i++){
            System.out.println("argument #" + i + " is " + args[i]);
        }
    }
}