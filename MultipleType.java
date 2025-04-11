public class MultipleType<T, U, V> {
    T a;
    U b;
    V c;

    MultipleType(T a, U b, V c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getFirst() {
        return a;
    }

    public U getSecond() {
        return b;
    }

    public V getThird() {
        return c;
    }
}

class Main4 {
    public static void main(String[] args) {
        MultipleType<Integer, String, Double> mt = new MultipleType<>(10, "gayathri", 3.14);
        System.out.println(mt.getSecond());

    }
}
