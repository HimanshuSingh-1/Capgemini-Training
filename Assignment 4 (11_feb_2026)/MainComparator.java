package capg;

interface Comparable<T> {
    int compare(T a, T b);
}

class IntegerCompare implements Comparable<Integer> {
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}

class StringCompare implements Comparable<String> {
    public int compare(String a, String b) {

        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }
}

public class MainComparator {
    public static void main(String[] args) {

        Comparable<Integer> intCmp = new IntegerCompare();
        System.out.println(intCmp.compare(10, 20));

        Comparable<String> strCmp = new StringCompare();
        System.out.println(strCmp.compare("ABC", "BCD"));
    }
}
