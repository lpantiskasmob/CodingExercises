import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FrogRiverOneTest {
    @Test
    void whenOnlyOneLeafFallsInRiverOfOne_FrogPasses() {
        int[] input = new int[] { 1 };
        int riverLength = 1;
        int expected = 0;
        int result = FrogRiverOne.solution(riverLength, input);
        assertEquals(expected, result);

    }

    @Test
    void whenOnlyOneLeafFallsInRiverOfTwo_FrogCannotPass() {
        int[] input = new int[] { 1 };
        int riverLength = 2;
        int expected = -1;
        int result = FrogRiverOne.solution(riverLength, input);
        assertEquals(expected, result);
    }

    @Test
    void whenLeavesFallInFirstPositionOfRiverOfTwo_FrogCannotPass() {
        int[] input = new int[] { 1, 1, 1, 1, 1, 1, 1, 1 };
        int riverLength = 2;
        int expected = -1;
        int result = FrogRiverOne.solution(riverLength, input);
        assertEquals(expected, result);
    }

    @Test
    void whenLeavesFallInSecondPositionOfRiverOfTwo_FrogCannotPass() {

        int[] input = new int[] { 2, 2, 2, 2, 2, 2 };
        int riverLength = 2;
        int expected = -1;
        int result = FrogRiverOne.solution(riverLength, input);
        assertEquals(expected, result);
    }

    @Test
    void frogPassesOnThirdLeaf() {

        int[] input = new int[] { 2, 2, 1 };
        int riverLength = 2;
        int expected = 2;
        int result = FrogRiverOne.solution(riverLength, input);
        assertEquals(expected, result);
    }

    @Test
    void codilityTestCase() {

        int[] input = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };
        int riverLength = 5;
        int expected = 6;
        int result = FrogRiverOne.solution(riverLength, input);
        assertEquals(expected, result);

    }
}
