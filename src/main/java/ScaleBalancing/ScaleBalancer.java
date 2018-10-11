package ScaleBalancing;

import java.util.ArrayList;
import java.util.List;

public class ScaleBalancer {

    public static String findSolution(Scale scale, WeightRack weightRack) {
        if (existsSingleWeightSolution(scale, weightRack)) {
            return String.valueOf(singleWeightSolution(scale, weightRack));
        } else {
            return searchForTwoWeightSolution(scale, weightRack);
        }
    }

    private static String searchForTwoWeightSolution(Scale scale, WeightRack weightRack) {
        List<SolutionPair> possibleSolutions = new ArrayList<>();
        for (Integer availableWeight : weightRack.getAvailableWeights()) {
            weightRack.removeWeight(availableWeight);
            scale.addWeightToLighterSide(availableWeight);
            if (existsSingleWeightSolution(scale, weightRack))
                possibleSolutions.add(new SolutionPair(availableWeight, singleWeightSolution(scale, weightRack)));
            scale.removeWeightFromLighterSide(availableWeight);
            weightRack.addWeight(availableWeight);
        }

        if (possibleSolutions.size() == 0) return "not possible";
        else return findOptimalSolution(possibleSolutions);

    }

    private static String findOptimalSolution(List<SolutionPair> possibleSolutions) {
        int minimumWeight = -1;
        SolutionPair optimalSolution = null;
        for (SolutionPair possibleSolution : possibleSolutions) {
            if (minimumWeight == -1 || possibleSolution.getWeight() < minimumWeight) {
                minimumWeight = possibleSolution.getWeight();
                optimalSolution = possibleSolution;
            }
        }
        return "" + optimalSolution;
    }

    private static Integer singleWeightSolution(Scale scale, WeightRack weightRack) {
        return scale.getWeightDifference();
    }

    private static boolean existsSingleWeightSolution(Scale scale, WeightRack weightRack) {
        return weightRack.hasWeight(scale.getWeightDifference());
    }
}
