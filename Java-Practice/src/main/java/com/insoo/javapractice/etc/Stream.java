package com.insoo.javapractice.etc;

import java.util.*;

/**
    filter
    map
    flatMap
    distinct
    toList
    forEach
    reduce

    anyMatch
    skip
    findFirst
 */
public class Stream {
    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"D");

        Collection<String> mapValues = map.values();
        mapValues.stream()
                .distinct()
                .map(m -> m + "-SS")
                .filter(f -> "D-SS".equals(f))
                .forEach(v -> System.out.println("#### Map, Filter : " + v));

        /**
           flatMap
           Stream<String[]> -> flatMap -> Stream<String>
           Stream<Set<String>> -> flatmap -> Stream<String>
           Stream<List<String>> -> flatmap -> Stream<String>
         */
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = numbers.stream()
                .flatMap(Collection::stream) // list -> list.stream()
                .toList();

        System.out.println("Flattened list: " + flattenedList);


        Optional<Integer> sum1 = flattenedList.stream().reduce(Integer::sum); // (x, y) -> x + y
        Integer sum2 = flattenedList.stream().reduce(10, Integer::sum);
        System.out.println("reduce sum1: " + sum1.get());
        System.out.println("reduce sum2: " + sum2);

    }
}
