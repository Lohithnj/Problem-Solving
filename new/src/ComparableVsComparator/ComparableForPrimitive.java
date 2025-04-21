package ComparableVsComparator;

import java.util.*;
public class ComparableForPrimitive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
//Sorting a List of Primitives (Wrapper Classes)
//If you sort a list of primitive wrapper classes (e.g., Integer, String, Double),
// Java does not need an explicit compareTo() because these classes already implement Comparable internally.


//Integer class implements Comparable<Integer>.
//public final class Integer extends Number implements Comparable<Integer> {
//    public int compareTo(Integer anotherInteger) {
//        return Integer.compare(this.value, anotherInteger.value);
//    }
//}

