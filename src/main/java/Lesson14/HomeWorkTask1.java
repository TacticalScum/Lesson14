package Lesson14;

import java.util.Arrays;

public class HomeWorkTask1 {

    public String arr(int[] arr) throws RuntimeException {
        int indexOf4 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) indexOf4 = i + 1;
        }

        if (indexOf4 == 0) throw new RuntimeException();
        int[] arrayFinal = Arrays.copyOfRange(arr, indexOf4, arr.length);
        return Arrays.toString(arrayFinal);
    }
}
