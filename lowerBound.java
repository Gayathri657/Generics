import java.util.List;
import java.util.ArrayList;

public class lowerBound {
    public static void addIntegersToList(List<? super Integer> list) {
        list.add(80);
        list.add(90);
        list.add(55);
    }

}

class Main2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(55);
        l.add(65);
        lowerBound.addIntegersToList(l);
        System.out.println(l);
    }
}
