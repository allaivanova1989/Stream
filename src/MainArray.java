import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MainArray {
    public static void main(String[] args) {

        Integer [] number = {5,20,76,-50,-63,45,17};
        Stream<Integer> stream = Arrays.stream(number);
        Integer min = stream.min(Integer::compareTo).get();
        System.out.println(min);
        Stream<Integer> stream2 = Arrays.stream(number);
        Integer max = stream2.max(Integer::compareTo).get();
        System.out.println(max);
        Stream<Integer> stream3 = Arrays.stream(number);
        Integer sum = stream3.reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(sum);
        Stream<Integer> stream4 = Arrays.stream(number);
        Object[] array1 = stream4.skip(4).toArray();
        System.out.println(Arrays.toString(array1));


    }
}
