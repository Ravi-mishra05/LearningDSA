package T1_Dailly_Questions_LC_2024.M4_April;

public class April8 {
    public static void main(String[] args) {
        int students[] = { 1, 1, 1, 0, 0, 1 };
        int sandwiches[] = { 1, 0, 0, 0, 1, 1 };
        System.out.println(countStudentsUnableToEat(students, sandwiches));
    }

    // public static int countStudents(int[] students, int[] sandwiches) {
    // int count = students.length;
    // int[] temp = new int[2 * count];

    // for (int i = 0; i < students.length; i++) {
    // temp[i] = students[i];
    // }

    // int tempIndex = students.length;
    // for (int i = 0; i < temp.length; i++) {
    // boolean studentFound = false;
    // for (int j = 0; j < sandwiches.length; j++) {
    // if (temp[i] == sandwiches[j]) {
    // count--;
    // for (int k = j; k < tempIndex - 1; k++) {
    // temp[k] = temp[k + 1];
    // }
    // tempIndex--;
    // studentFound = true;
    // break;
    // }
    // }
    // if (!studentFound) {
    // break;
    // }
    // }
    // return count;
    // }

    public static int countStudentsUnableToEat(int[] students, int[] sandwiches) {
        int[] preferenceCount = new int[2];
        for (int student : students) {
            preferenceCount[student]++;
        }

        for (int sandwich : sandwiches) {
            if (preferenceCount[sandwich] > 0) {
                preferenceCount[sandwich]--;
            } else {
                return preferenceCount[0] + preferenceCount[1];
            }
        }

        return 0;
    }
}
