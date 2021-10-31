import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainAppTest {


    @Test
    void test1Task1() {
        int[] arr1 = new int[]{1, 5, 3, 6, 4, 7, 8, 7, 9};
        int[] arr2 = new int[]{7, 8, 7, 9};
        assertArrayEquals(arr2, MainApp.task1(arr1));
    }

    @Test
    void test2Task1() {
        int[] arr1 = new int[]{1, 2, 3, 5, 6, 7};
        assertThrows(RuntimeException.class, () -> MainApp.task1(arr1));
    }


    @Test
    void test1Task2() {
        int [] arr1=new int []{1,2,3,4,5,6,7};
        assertFalse(MainApp.task2(arr1));
    }

    @Test
    void test2Task2() {
        int []arr1=new int[]{1,4,1,4,1,4};
        assertTrue(MainApp.task2(arr1));
    }
}