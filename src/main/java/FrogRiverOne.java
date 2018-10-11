import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    private static Set<Integer> positionsFilled;

    public static int solution(int riverLength, int[] input) {
        if (input.length < riverLength)
            return -1;
        else {
            positionsFilled = new HashSet<>();
            for (int i = 0; i < input.length; i++) {
                int currentLeafPosition = input[i];
                if (positionIsEmpty(currentLeafPosition))
                    fillPosition(currentLeafPosition);
                if (areAllPositionsFilled(riverLength))
                    return i;
            }
            return -1;
        }
    }

    private static boolean areAllPositionsFilled(int riverLength) {
        return positionsFilled.size() == riverLength;
    }

    private static void fillPosition(int currentLeafPosition) {
        positionsFilled.add(currentLeafPosition);
    }

    private static boolean positionIsEmpty(int currentLeafPosition) {
        return !positionsFilled.contains(currentLeafPosition);
    }
}
