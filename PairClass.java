public class PairClass<T> {
    T firstpair;
    T secondpair;

    PairClass(T firstpair, T secondpair) {
        this.firstpair = firstpair;
        this.secondpair = secondpair;
    }

    public T getFirst() {
        return firstpair;
    }

    public T getSecond() {
        return secondpair;
    }

    public static void main(String[] args) {
        PairClass<Integer> a = new PairClass<>(10, 20);
        printPair(a);
        PairClass<String> s = new PairClass<>("Gayathri", "jehd");
        printPair(s);
        PairClass<Double> d = new PairClass<>(3.14, 7.27);
        printPair(d);

    }

    public static <T> void printPair(PairClass<T> x) {
        System.out.println("First Element : " + x.getFirst());
        System.out.println("Second Element : " + x.getSecond());
    }

}
