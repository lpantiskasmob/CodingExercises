package ScaleBalancing;

import java.util.Scanner;

public class ScaleBalancing {


    public static String balanceScale(String[] strArr) {


        Scale scale=new Scale(strArr[0]);
        WeightRack weightRack=new WeightRack(strArr[1]);

        return ScaleBalancer.findSolution(scale,weightRack);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(balanceScale(s.nextLine().split(", \"")));
    }

}
