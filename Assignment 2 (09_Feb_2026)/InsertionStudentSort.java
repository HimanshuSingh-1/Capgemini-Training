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

class InsertionStudentSort {
    public static void main(String[] args) {

        Student[] arr = {
            new Student(3, "A"),
            new Student(1, "B"),
            new Student(2, "C")
        };

        for (int i = 1; i < arr.length; i++) 
                     {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].rollNo > key.rollNo) 
             {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
