import java.util.List;
import java.util.ArrayList;

class Intersection {
    public static <T extends Comparable<T>> List<T> findIntersection(List<T> list1, List<T> list2) {
        List<T> list3 = new ArrayList<>();

        for (T i : list1) {
            for (T j : list2) {
                if (i.compareTo(j) == 0) {
                    list3.add(i);
                }
            }
        }
        return list3;
    }

    public static void main(String[] args) {
        List<Integer> i = List.of(10, 30, 56, 78, 98);
        List<Integer> i1 = List.of(20, 67, 54, 53, 21, 30, 10);
        System.out.println(findIntersection(i, i1));
        List<String> str = List.of("Gayathri", "hfsh", "hsgdh");
        List<String> str1 = List.of("Gayathri", "hfsh", "hsgdh", "jsg", "hsgh");
        System.out.println(findIntersection(str, str1));
        List<Double> d = List.of(9.8, 3.14, 5.6);
        List<Double> d1 = List.of(9.8, 3.14, 6.78, 7.90);
        System.out.println(findIntersection(d, d1));

    }

}
