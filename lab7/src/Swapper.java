public class Swapper <T>{
    private T object;

    public Swapper(T object){
        this.object = object;
    }

    public static <T> void swap(Swapper<T> firstSwapper, Swapper<T> secondSwapper){

        T temp = firstSwapper.object;
        firstSwapper.object = secondSwapper.object;
        secondSwapper.object = temp;
    }

    public T getObject(){
        return object;
    }
}

