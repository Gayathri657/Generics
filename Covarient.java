class Animal<T> {
    T a;
    T b;

    Animal(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public Animal<T> create() {
        System.out.println("Animal instance is created");
        return new Animal<T>(null, null);
    }
}

class Dog<T> extends Animal<T> {
    T c;
    T d;

    Dog(T c, T d) {
        super(null, null);
        this.c = c;
        this.d = d;
    }

    public Dog<T> create() {
        return new Dog<T>(null, null);
    }

}

public class Covarient {
    public static void main(String[] args) {
        Animal<Integer> a = new Animal(10, 20);
        Animal<Integer> s = a.create();

        Dog<Double> dog = new Dog<>(3.14, 4.23);
        Dog<Double> In = dog.create();

    }
}
