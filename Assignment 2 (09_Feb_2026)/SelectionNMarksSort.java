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

class SelectionNMarksSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(new int[]{80, 70, 60}, "A"),
            new Student(new int[]{80, 70, 50}, "B"),
            new Student(new int[]{75, 90, 95}, "C")
        };

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                boolean smaller =false;
                for (int k = 0; k<arr[j].marks.length; k++) {
                    if (arr[j].marks[k] < arr[min].marks[k]) {
                        smaller = true;
                        break;
                    }
                    if (arr[j].marks[k] > arr[min].marks[k])
                        break;
                }

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
