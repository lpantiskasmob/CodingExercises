package ScaleBalancing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightRack {


    private Map<Integer, Integer> weightStash;

    public WeightRack(String input) {
        List<Integer> weightsAvailable= StringParser.parseStringIntoList(input);
        weightStash = new HashMap<>(weightsAvailable.size());
        for (Integer weight : weightsAvailable) {
            weightStash.put(weight, weightStash.getOrDefault(weight, 0) + 1);
        }

    }

    public boolean hasWeight(Integer weight){
        return weightStash.get(weight)!=null && weightStash.get(weight)>0;
    }

    public void removeWeight(int weight){
        weightStash.replace(weight,weightStash.get(weight)-1);

    }

    public void addWeight(int weight){
        weightStash.replace(weight,weightStash.get(weight)+1);
    }

    public List<Integer> getAvailableWeights(){
        List<Integer> availableWeights=new ArrayList<>();
        for (Integer weight : weightStash.keySet()) {
            if(weightStash.get(weight)!=null && weightStash.get(weight)>0){
                availableWeights.add(weight);
            }
        }
        return availableWeights;
    }



}
