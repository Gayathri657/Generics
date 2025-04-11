import java.util.Arrays;

class SwapElements<T> {

    public void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = { 1, 2, 24, 55, 6, 7, };
        String[] b = { "Hi", "Hello", "where", "who", "why" };
        SwapElements<Integer> s = new SwapElements<>();
        s.swapElements(a, 2, 3);
        System.out.println(Arrays.toString(a));
        SwapElements<String> s1 = new SwapElements<>();
        s1.swapElements(b, 2, 3);
        System.out.println(Arrays.toString(b));

    }
}