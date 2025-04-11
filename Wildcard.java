import java.util.List;
import java.util.ArrayList;

public class Wildcard {

    public <T extends Number> double sumList(List<T> list) {
        double sum = 0;

        for (Number i : list) {
            sum = sum + i.doubleValue();
        }
        return sum;

    }

}

class Main3 {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(70);
        i.add(90);
        i.add(100);
        Wildcard w = new Wildcard();
        System.out.println(w.sumList(i));
        List<Double> d = new ArrayList<>();
        d.add(3.14);
        d.add(9.23);
        d.add(7.65);
        d.add(9.12);
        System.out.println(w.sumList(d));

    }
}
