package exercise1;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] ints = {24, 25, 0, 28, 6, 8, 15, 29, 6, 8, 6, 0, 15, 6, 5, 22, 21, 1, 16, 11};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println("Najmniejsza liczba: " + ints[0]);
        System.out.println("Największa liczba: " + ints[ints.length - 1]);
        int indexOf15 = Arrays.binarySearch(ints, 15);
        System.out.println("Indeks pierwszego wystąpienia 15: " + indexOf15);
    }
}
