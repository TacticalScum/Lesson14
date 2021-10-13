package Lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HomeWorkTask2Test {
    private HomeWorkTask2 task2;

    @BeforeEach
    void init() {
        task2 = new HomeWorkTask2();
    }

    @Test
    void arrayCheck() {
        int[] arrTest1 = {1, 1, 1, 4, 4, 1, 4, 4};
        boolean arrayItog1 = true;

        int[] arrTest2 = {1, 1, 1, 1, 1, 1};
        boolean arrayItog2 = false;

        int[] arrTest3 = {4, 4, 4, 4};
        boolean arrayItog3 = false;

        int[] arrTest4 = {1, 1, 1, 4, 4, 3, 4, 4};
        boolean arrayItog4 = false;

        Assertions.assertEquals(arrayItog1, task2.arrayCheck(arrTest1));
        Assertions.assertEquals(arrayItog2, task2.arrayCheck(arrTest2));
        Assertions.assertEquals(arrayItog3, task2.arrayCheck(arrTest3));
        Assertions.assertEquals(arrayItog4, task2.arrayCheck(arrTest4));
    }
}