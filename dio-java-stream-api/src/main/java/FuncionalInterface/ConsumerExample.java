package FuncionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        numeros.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
