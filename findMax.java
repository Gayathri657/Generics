public class findMax {
    public <T extends Comparable<T>> T max(T[] a) {
        T Max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(Max) > 0) {
                Max = a[i];
            }
        }
        return Max;
    }
}

class Main {
    public static void main(String[] args) {
        Integer[] i = { 1, 2, 3, 4, 5, 9, 18 };
        Character[] c = { 'Z', 'A', 'q', 'a', 'B', 'o', 'i', 'u', 'z' };
        String[] s = { "zebra", "monkey", "doney" };
        findMax a = new findMax();
        System.out.println(a.max(i));
        System.out.println(a.max(c));
        System.out.println(a.max(s));

    }

}