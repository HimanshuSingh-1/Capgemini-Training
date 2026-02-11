package capg;


class Studentss {
    int id;
    String name;
    int age;

    Studentss(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

interface Function<T, K> {
    K call(T obj);
}

class DynamicExtractor<T, K> {

    private Function<T, K> function;

    DynamicExtractor(Function<T, K> function) {
        this.function = function;
    }

    K extract(T obj) {
        return function.call(obj);
    }
}

public class DynamicExtract {

    public static void main(String[] args) {

        Studentss s = new Studentss(1, "ABC", 23);

        DynamicExtractor<Studentss, String> nameEx =
                new DynamicExtractor<>(student -> student.name);

        DynamicExtractor<Studentss, Integer> ageEx =
                new DynamicExtractor<>(student -> student.age);

        System.out.println("Name: " + nameEx.extract(s));
        System.out.println("Age: " + ageEx.extract(s));
    }
}
