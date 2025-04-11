public class genericType<T> {
    T a;

    genericType(T a) {
        this.a = a;
    }

    T get() {
        return a;
    }

}

class Dog {
    public void Bark() {
        System.out.println("Dog has barked");
    }
}

class Main {
    public static void main(String[] args) {
        genericType<String> x = new genericType<>("Hello");
        System.out.println(x.get());
        genericType<Dog> d = new genericType<>(new Dog());
        System.out.println(d.get());

    }
}
