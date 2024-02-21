import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.*;


public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(12,11,21,14,16,19);

        numberList.stream().filter(a->a%2 == 0).map(a->a*a).sorted()
                .forEach(System.out::println);

        List<Integer> newList=numberList.stream().filter(a->a%2 == 0).map(a->a*a)
                .sorted().collect(Collectors.toList());

        out.println(numberList);
        out.println(newList);

        int maxValue=numberList.stream().max(Integer::compare).get();
        out.println("Max Value :"+maxValue);

    }
}
