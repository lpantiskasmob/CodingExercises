package ScaleBalancing;

import java.util.List;

public class Scale {

    private int smallerWeight;
    private int largerWeight;

    public Scale(String input) {
        List<Integer> weightsOnScale = StringParser.parseStringIntoList(input);
        smallerWeight = weightsOnScale.get(0);
        if (weightsOnScale.get(1) < smallerWeight) {
            smallerWeight = weightsOnScale.get(1);
            largerWeight = weightsOnScale.get(0);
        } else largerWeight = weightsOnScale.get(1);
    }

    public int getWeightDifference() {
        return Math.abs(smallerWeight - largerWeight);
    }

    public void addWeightToLighterSide(int weight) {
        smallerWeight += weight;
    }

    public void removeWeightFromLighterSide(int weight) {
        smallerWeight -= weight;
    }
}
