package Questions;

// import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str = new String("Ravi");
        System.out.println(reverseWord(str));
        int x = Integer.MAX_VALUE;
        
    }

    public static String reverseWord(String str){
        char[] array = str.toCharArray();
        int left = 0;
        int right = array.length-1;
        while (left < right) {
            swap(array, left, right);
            left++;
            right--;
        }
        return new String(array);
    }

    public static void swap (char[] array, int index1, int index2){
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
