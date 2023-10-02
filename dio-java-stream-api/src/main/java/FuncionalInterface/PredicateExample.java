package FuncionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "javascript", "kotlin", "python", "c", "go");

//        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .forEach(System.out::println);
    }
}
