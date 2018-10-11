package ScaleBalancing;

public class SolutionPair {

    private int firstWeight;
    private int secondWeight;

    public SolutionPair(int firstWeight, int secondWeight) {
        this.firstWeight = firstWeight;
        this.secondWeight = secondWeight;
    }

    public String toString(){
        int minWeight=Math.min(firstWeight,secondWeight);
        int maxWeight= Math.max(firstWeight,secondWeight);
        return String.valueOf(minWeight)+","+String.valueOf(maxWeight);
    }

    public int getWeight(){
        return firstWeight+secondWeight;
    }
}
