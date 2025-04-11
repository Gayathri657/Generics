import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintAnyList {
    public static void printList(List<?> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<String> a = Arrays.asList("Hi", "Hello", "What");
        List<Integer> b = Arrays.asList(1, 22, 3, 4, 5, 6, 77);
        printList(a);
        printList(b);
    }
}
