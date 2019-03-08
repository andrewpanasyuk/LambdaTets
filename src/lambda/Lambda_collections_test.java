package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda_collections_test {
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArray(array);
        fillList(list);

        System.out.println(Arrays.toString(array));
        System.out.println(list);
//        all elements mult 2
//        var_1
        System.out.println(" -------------------- \n ver_1");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            list.set(i, list.get(i) * 2);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(list);

//        ver_2
        array = Arrays.stream(array).map(i -> i * 2).toArray();
        list = list.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(" -------------------- \n ver_2");
        System.out.println(Arrays.toString(array));
        System.out.println(list);

        //        ver_3
        array = Arrays.stream(array).map(i -> 3).toArray();
        list = list.stream().map(i -> i + 1).collect(Collectors.toList());
        System.out.println(" -------------------- \n ver_3");
        System.out.println(Arrays.toString(array));
        System.out.println(list);

//        filter method

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArray(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(" -------------------- \n ver_4");
        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);

//         for
        System.out.println(" -------------------- \n ver_5");
        Arrays.stream(arr2).forEach(System.out::print);
        list2.stream().forEach(a -> System.out.print(a));

// reduce

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArray(arr3);
        fillList(list3);
        System.out.println();
        System.out.println(" -------------------- \n ver_5");
        System.out.println(Arrays.toString(arr3));
//        int a = Arrays.stream(arr3).reduce((akk, i) -> akk + i).getAsInt();
        int a = Arrays.stream(arr3).reduce(10, (akk, i) -> akk + i);
        int b = list3.stream().reduce((akk, c) -> akk + c).get();
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        int[] arr4 = new int[10];
        fillArray(arr4);
        int f = Arrays.stream(arr4).filter(x -> x % 2 != 0).reduce((akk, y) -> akk + y).getAsInt();
        arr4 = Arrays.stream(arr4).filter(x -> x % 2 != 0).map(y -> y * 2).toArray();
        System.out.println("f = " + f);
        System.out.println(Arrays.toString(arr4));

        System.out.println("SET");
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set = set.stream().map(x -> x * 2).collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }
}
