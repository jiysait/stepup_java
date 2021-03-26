package common;

import java.util.*;
import java.util.stream.Collectors;

/**
 * # Get an instance of ArrayList by using an Array
 * Arrays.asList(arr)
 * Collections.addAll(A, B)
 * new ArrayList<>(Arrays.asList(arr))
 * List.of(arr)
 *
 * # SORT
 * names.sort(Comparator.comparing(String::toString)) O
 * Collections.sort(names) O
 * names.sort(List.DESCENDING) X
 * names.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList()) O
 */

public class ArrayLIstSort {
    public static void main(String[] args) {
        String[] names = {"Jongil Yoon", "John Smith", "Bekky Cruide", "Cory Burnace", "Cugar Merry"};

        //Method 1
        List<String> nameList_1 = Arrays.asList(names);

        //Method 2
        List<String> nameList_2 = new ArrayList<String>();
        Collections.addAll(nameList_2, names);

        //Method 3
        ArrayList<String> nameList_3 = new ArrayList<>(
            Arrays.asList(names)
        );

        //Method 4
        List<String> nameList_4 = new ArrayList<>(
            List.of(names)
        );

        nameList_1.sort(Comparator.comparing(String::toString));
        System.out.println(nameList_1);

        Collections.sort(nameList_2);
        System.out.println(nameList_2);

        /**
         * Compile Error
         * cannot find symbol
         */
//        nameList_3.sort(List.DESCENDING);
        System.out.println(nameList_3);

        /**
         * 연구필요
         */
        nameList_4.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        System.out.println(nameList_4);
    }
}
