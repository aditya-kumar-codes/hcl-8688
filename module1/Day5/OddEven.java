package Day5;

import java.util.function.Predicate;

//OddEven using Lambda expression
//Built-in functional interface Predicate is used to check if a number is even or odd
public class OddEven {
    //boolean isEven(int a);
     static Predicate<Integer> isEven = a -> a % 2 == 0;

    public static void main(String[] args) {
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(11));
//        OddEven number =(a)->a%2==0;
//        System.out.println(number.isEven(10));
//        System.out.println(number.isEven(11));
    }

}
