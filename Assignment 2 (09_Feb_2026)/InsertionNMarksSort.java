class Student {
    int[] marks;
    String name;

    Student(int[] m, String n) {
        marks = m;
        name = n;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < marks.length; i++)
            s += marks[i] + " ";
        return s + name;
    }
}

class InsertionNMarksSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(new int[]{80, 70, 60}, "A"),
            new Student(new int[]{80, 70, 50}, "B"),
            new Student(new int[]{75, 90, 95}, "C")
        };

        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0) {


                boolean move = false;

                for (int k = 0; k < key.marks.length; k++) {
                    if (arr[j].marks[k] > key.marks[k]) {
                        move = true;
                        break;
                    }
                    if (arr[j].marks[k] < key.marks[k])
                        break;
                }

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
