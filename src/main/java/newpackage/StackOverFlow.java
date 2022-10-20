package newpackage;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackOverFlow {
    public static void results(List<String> strings) {
        strings.stream().filter(res -> res.equalsIgnoreCase("Jaswanth")).collect(Collectors.toList());
        List<String>strings1 = new ArrayList<>();
        strings1.add("Jaswanth");
        strings1.add("Reddy");
        strings1.add("Kesaer");
        strings1.add("India");
        Map<String, String> collect = strings1.stream().collect(Collectors.toMap(String::toUpperCase, Function.identity()));


    }

    public static void main(String[] args) {
        String[] a = {"Jaswanth", "Kesar", "Reddy", "Chinna"};
        results(Arrays.asList(a));

        String[]b = {"Kesar", "Jaswanth"};
        List<String> strings = Arrays.asList(b);
        List<String> collect = strings.stream().map(s -> s.split("")).map(Arrays::toString).distinct().collect(Collectors.toList());
        System.out.println(collect);
        List<String> collect1 = strings.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        List<Integer> list = Arrays.asList(1, 10, 3, 7, 5);
        int abc = list.stream()
                .peek(num -> System.out.println("will filter " + num))
                .filter(x -> x > 5)
                .findFirst()
                .get();
        System.out.println("Printing ++++++++++"+ abc);


    }
}
