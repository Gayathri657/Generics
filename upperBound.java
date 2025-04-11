import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class upperBound {
    public void printUpperBoundList(List<? extends Number> list) {
        for (Number i : list) {
            System.out.println(i);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        List<Double> s = Arrays.asList(3.14, 7.8, 9.23);
        upperBound uB = new upperBound();
        uB.printUpperBoundList(l);
        uB.printUpperBoundList(s);

    }
}
