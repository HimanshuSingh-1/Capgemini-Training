class Student {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

public class SortObjects {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(2, "Ayush"),
            new Student(1, "Boss"),
            new Student(3, "Danny"),
            new Student(5, "John"),
            new Student(4, "Vinny")
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-i- 1; j++) {
                if (arr[j].rollNo > arr[j + 1].rollNo) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
