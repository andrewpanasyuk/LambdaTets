package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest_3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("machine");
        list.add("by");
        list.add("ok");
        list.add("includes");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()){
//                    return -1;
//                } else if (o1.length() < o2.length()) {
//                    return 1;
//                }
//                return 0;
//            }
//        });

        list.sort((a, b) -> a.length() < b.length() ? 1 : -1);
        System.out.println(list);

        list.sort((a, b) -> a.length() > b.length() ? 1 : -1);
        System.out.println(list);

        list.sort((a, b) -> {
            if (a.length() < b.length()) {
                return 1;
            } else if (a.length() > b.length()) {
                return -1;
            }
            return 0;
        });
        System.out.println(list);


        Comparator<String> comparator = (a, b) -> {
            if (a.length() < b.length()) {
                return -1;
            } else if (a.length() > b.length()) {
                return 1;
            }
            return 0;
        };
        list.sort(comparator);
        System.out.println(list);
    }
}
