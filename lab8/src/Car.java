public class Car {
    public String mark;
    public String model;
    protected int owners;
    private double price;

    Car(String mark, String model, int owners, double price){
        this.mark = mark;
        this.model = model;
        this.owners = owners;
        this.price =  price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void print(){
        System.out.println("mark: " + mark);
        System.out.println("model: " + model);
        System.out.println("price: " + price);
        System.out.println("owners: " + owners);

    }
}
