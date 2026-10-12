package Day5;
//Inbuilt functional interfaces in Java
import java.util.function.*;


public class Inbuit_Interface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = a -> a % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));

        Function<Integer, Integer> square = a -> a * a;
        System.out.println(square.apply(10));
        System.out.println(square.apply(11));

        Consumer<String> print = a -> System.out.println("Hello " + a);
        print.accept("Aditya");
        print.accept("Rahul");

        Supplier<Integer> getRandomNumber = () -> (int) (Math.random() * 1000000);
        System.out.println(getRandomNumber.get());
        System.out.println(getRandomNumber.get());
    }
}
