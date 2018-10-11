import ScaleBalancing.ScaleBalancing;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ScaleBalancingTest {
    @Test
    @DisplayName("Return solution with only one weight when available")
    void shouldReturnOnlyOneWeight() {
        String[] input="\"[3, 4]\", \"[1, 2, 7, 7]\"".split(", \"");
        assertEquals("1", ScaleBalancing.balanceScale(input));
    }


    @Test
    @DisplayName("Return two weights that are on the same side if needed")
    public void shouldReturnTwoWeights() {
        String[] input="\"[13, 4]\", \"[1, 2, 3, 6, 14]\"".split(", \"");
        assertEquals("3,6", ScaleBalancing.balanceScale(input));
    }


    @Test
    @DisplayName("In case of multiple solutions, return one with minimum weights")
    void returnMinimumSolution() {
        String[] input="\"[6, 2]\", \"[1, 10, 6, 5]\"".split(", \"");
        assertEquals("1,5", ScaleBalancing.balanceScale(input));
    }

    @Test
    @DisplayName("In case of no solutions, return \"not possible\"")
    void returnNotPossibleString() {
        String[] input="\"[6, 2]\", \"[11, 12, 11, 10]\"".split(", \"");
        assertEquals("not possible", ScaleBalancing.balanceScale(input));
    }


}
