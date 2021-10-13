package Lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class HomeWorkTask1Test {
    private HomeWorkTask1 task1;

    @BeforeEach
    void init() {
        task1 = new HomeWorkTask1();
    }

    @Test
    void arr() throws RuntimeException {
        int[] arrTest1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arrTestRight1 = {5, 6, 7};
        String arrStringRightTest1 = Arrays.toString(arrTestRight1);

        int[] arrTest2 = {1, 2, 3, 5, 6};
        Exception exceptionTest2 = new RuntimeException();

        int[] arrTest3 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] arrTestRight3 = {1, 7};
        String arrStringRightTest3 = Arrays.toString(arrTestRight3);

        Assertions.assertEquals(arrStringRightTest1, task1.arr(arrTest1));

        try {
            task1.arr(arrTest2);
        } catch (RuntimeException e) {
            Assertions.assertEquals(exceptionTest2.toString(), e.toString());
        }

        Assertions.assertEquals(arrStringRightTest3, task1.arr(arrTest3));
    }
}