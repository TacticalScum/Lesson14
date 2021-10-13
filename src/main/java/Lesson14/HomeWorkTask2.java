package Lesson14;

public class HomeWorkTask2 {

    public boolean arrayCheck(int[] arr) {
        int value1 = 1;
        int value2 = 4;

        boolean containsValue1 = false;
        boolean containsValue2 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value1) {
                containsValue1 = true;
            } else if (arr[i] == value2) {
                containsValue2 = true;
            } else {
                return false;
            }
        }
        return containsValue1 && containsValue2;
    }
}
