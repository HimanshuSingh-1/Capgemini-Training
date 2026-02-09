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

class SelectionStudentSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(3, "A"),

            new Student(1, "B"),

            new Student(2, "C")
        };

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j <arr.length; j++) {
                if (arr[j].rollNo < arr[min].rollNo)
                    min = j;
            }
            Student temp =    arr[i];
            arr[i] = arr[min];

            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
