class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student a) {
        if (this.age > a.age) {
            return 1;
        } else if (this.age < a.age) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return name + "," + age;
    }
}

class Main {
    public static void main(String[] args) {
        Integer[] i = { 1, 3, 44, 55, 77, 34, 67, 78 };
        Character[] c = { 'A', 'G', 'T', 'I', 'O', 'P', 'U' };
        String[] s = { "See", "You", "tomorrow", "Gayathri", "Bye" };
        Student[] v = new Student[3];
        v[0] = new Student("gayathri", 93);
        v[1] = new Student("gshgdh", 84);
        v[2] = new Student("etfeh", 01);
        sort(v);
        sort(i);
        sort(c);
        sort(s);

    }

    public static <T extends Comparable<T>> void sort(T[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j].compareTo(v[j + 1]) > 0) {
                    swap(j, j + 1, v);
                }
            }
        }
        for (T i : v) {
            System.out.println(i);
        }
    }

    public static <T> void swap(int i, int j, T[] a) {
        T temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
