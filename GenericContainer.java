import java.util.Arrays;

public class GenericContainer<T> {
    T[] array;

    GenericContainer(T[] array) {
        this.array = array;
    }

    public void getLength() {
        System.out.println(array.length);
    }

    public void getItem(int i) {
        System.out.println("Element at index " + i + " " + "is : " + array[i]);
    }

    public void printItems() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Integer[] i = { 10, 20, 30, 40 };
        String[] s = { "java", "Gayathri", "Hi", "hello" };
        Double[] d = { 3.14, 2.13, 8.91 };
        Float[] f = { 9.86f, 6.54f, 2.343f };
        GenericContainer gc = new GenericContainer(i);
        gc.getLength();
        gc.getItem(3);
        gc.printItems();
        GenericContainer ge = new GenericContainer(s);
        ge.getLength();
        ge.getItem(2);
        ge.printItems();

    }
}