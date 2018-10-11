package ScaleBalancing;

import java.util.ArrayList;
import java.util.List;

public class StringParser {

    public static List<Integer> parseStringIntoList(String input){
        input=removeBrackets(removeSlashes(input));
        List<Integer> outputList = new ArrayList<>();
        for (String weight : input.split(", ")
             ) {
            outputList.add(Integer.valueOf(weight));
        }
        return outputList;
    }

    private static String removeBrackets(String input){
        String output=input.replace("]", "");
        return  output.replace("[", "");
    }

    private static String removeSlashes(String input){
        return input.replace("\"", "");
    }
}
