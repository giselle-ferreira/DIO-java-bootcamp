package FuncionalInterface;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        // ou Optional<String> optionalValue = Optional.empty();
        String result = optionalValue.orElse("Default");
        System.out.println(result);
    }
}
