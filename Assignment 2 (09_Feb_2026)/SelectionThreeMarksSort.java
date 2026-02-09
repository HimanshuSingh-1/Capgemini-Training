class Student {
    int m1;
    int m2;
    int m3;
    String name;

    Student(int a, int b, int c, String n) {
        m1 = a;
        m2 = b;
        m3 = c;
        name = n;
    }

    public String toString() {
        return m1 + " " + m2 + " " + m3 + " " + name;
    }
}

class SelectionThreeMarksSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(80, 70, 60,"A"),
            new Student(80, 70, 50,"B"),
            new Student(75, 90, 95,"C")
        };

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                boolean smaller = false;

                if (arr[j].m1 < arr[min].m1)
                    smaller = true;
                else if (arr[j].m1 ==arr[min].m1 && arr[j].m2 < arr[min].m2)
                    smaller = true;
                else if (arr[j].m1 ==arr[min].m1 &&
                         arr[j].m2 == arr[min].m2 &&
                         arr[j].m3 < arr[min].m3)
                    smaller = true;

                if (smaller)
                    min = j;
            }

            Student temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
