class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println(name + " is " + age + " years old");
    }
}


public class Main {
    public static void main(String[] args) {
        Person A = new Person("Alex", 23);
        Person B = new Person("Bob", 20);

        A.print();
        B.print();

        Swapper<Person> swapperA = new Swapper<Person>(A);
        Swapper<Person> swapperB = new Swapper<Person>(B);

        Swapper.swap(swapperA, swapperB);
        A = swapperA.getObject();
        B = swapperB.getObject();

        A.print();
        B.print();


    }
}
