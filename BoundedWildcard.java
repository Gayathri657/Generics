import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class BoundedWildcard {
    public void differenceUpper(List<? extends Number> list) {
        for (Number i : list) {
            System.out.println(i.doubleValue());
        }
    }

    public void differenceLower(List<? super Integer> list) {
        list.add(44);
        list.add(79);
        list.add(33);
        Iterator<?> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }
}

class Main2 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Double> d = new ArrayList<>();
        d.add(3.14);
        d.add(4.56);
        d.add(9.87);
        List<Float> f = new ArrayList<>();
        f.add(3.14f);
        f.add(4.15f);
        f.add(5.64f);
        BoundedWildcard bd = new BoundedWildcard();
        bd.differenceLower(a);
        bd.differenceUpper(a);

    }
}
