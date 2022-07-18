package Stream;

import java.util.*;
import java.util.stream.*;

/*
* stream Methods
*
* stream()
* filter()
* map()
* sorted()
* collect()
* get()
* max()
* min()
* forEach()
*
* */

public class StreamExample {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(15);
        list1.add(5);
        list1.add(1);
        list1.add(17);
        list1.add(2);
        list1.add(28);
        list1.add(25);

        System.out.println(">>> list1 :: " + list1);

        List<Integer> filterEvenValues = list1.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        System.out.println(">>> filterEvenValues :: " + filterEvenValues);

        List<Integer> filterOddValues = list1.stream().filter(l -> l % 2 == 1).collect(Collectors.toList());
        System.out.println(">>> filterOddValues :: " + filterOddValues);

        List<Integer> mapValues = list1.stream().map(l -> l + 5).collect(Collectors.toList());
        System.out.println(">>> mapValues :: " + mapValues);

        List<Integer> sortValuesASC = list1.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(">>> sortValuesASC :: " + sortValuesASC);

        List<Integer> sortValuesDESC = list1.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(">>> sortValuesDESC :: " + sortValuesDESC);

        Integer minValue = list1.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(">>> minValue :: " + minValue);

        Integer maxValue = list1.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(">>> maxValue :: " + maxValue);

        list1.stream().forEach(System.out::println);
    }
}
