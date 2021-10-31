import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        //   int [] arr1= new int[]{1, 3, 5, 6, 7, 9, 8};
        // System.out.println(Arrays.toString(task1(arr1)));

    }

    public static int[] task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                return Arrays.copyOfRange(arr, i + 1, arr.length);
            }

        }
        throw new RuntimeException("нету 4");

    }

    public static boolean task2(int[] arr) {
        boolean num1 = false;
        boolean num4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
            if (arr[i] == 1) {
                num1 = true;
            }
            if (arr[i] == 4) {
                num4 = true;
            }

        }
        return num1 && num4;
    }

}
