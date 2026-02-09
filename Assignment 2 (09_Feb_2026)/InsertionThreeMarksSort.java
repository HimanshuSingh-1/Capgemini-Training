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

class InsertionThreeMarksSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(80, 70, 60, "A"),
            new Student(80, 70, 50, "B"),
            new Student(75, 90, 95, "C")
        };



        for (int i = 1; i < arr.length; i++) 

            {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                boolean move = false;

                if (arr[j].m1 > key.m1)
                    move = true;
                else if (arr[j].m1 == key.m1 && arr[j].m2 > key.m2)
                    move = true;
                else if (arr[j].m1 == key.m1 &&
                         arr[j].m2 == key.m2 &&
                         arr[j].m3 > key.m3)
                    move = true;

                if (!move)
                    break;

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
