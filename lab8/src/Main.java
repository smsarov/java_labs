import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void printClassInfo(Class<?> myClass) {
        System.out.println("Class name: " + myClass.getName());

        int modifiers = myClass.getModifiers();
        System.out.println("Modifier: " + Modifier.toString(modifiers));

        System.out.println("\nFields:");
        for (Field field : myClass.getDeclaredFields()) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType().getName());
            System.out.println("Field modifiers: " + Modifier.toString(field.getModifiers()));
            System.out.println();
        }

        System.out.println("\nMethods:");
        for (Method method : myClass.getDeclaredMethods()) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
            System.out.println("Method modifiers: " + Modifier.toString(method.getModifiers()));

            System.out.println("Method parameters:");
            for (Class<?> type : method.getParameterTypes()) {
                System.out.println("  " + type.getName());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Car C = new Car("BMW", "X5", 3, 99999.99);

        printClassInfo(Car.class);
    }
}