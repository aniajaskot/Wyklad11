package exercise2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("k", "k", "z", "k", "a", "w", "b", "n", "k", "a");
        String firstElement = strings.get(0);

        System.out.println(strings);

        Collections.sort(strings);
        System.out.println(strings);

        Collections.reverse(strings);
        System.out.println(strings);

        int frequency = Collections.frequency(strings, firstElement);
        System.out.println(firstElement + ": " + frequency);
    }
}
