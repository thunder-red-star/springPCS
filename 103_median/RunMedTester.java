// Running Median Heap Implementation tester

import java.util.Scanner;
import java.util.ArrayList;

public class RunMedTester {
    private static String colorRedEsc = "\u001B[31m";
    private static String colorGreenEsc = "\u001B[32m";
    private static String colorResetEsc = "\u001B[0m";

    public static void main(String[] args) {
        ArrayList<Integer> normalMedian = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        RunMed runMed = new RunMed();
        while (scan.hasNext()) {
            int num = scan.nextInt();
            runMed.add(num);
            normalMedian.sort(null);
            normalMedian.add(num);
            int normalMed = (normalMedian.size() % 2 == 0) ? (normalMedian.get(normalMedian.size() / 2) + normalMedian.get(normalMedian.size() / 2 - 1)) / 2 : normalMedian.get(normalMedian.size() / 2);
            System.out.println("RunMed median: " + colorGreenEsc + runMed.getMedian() + colorResetEsc);
            System.out.println("Normal median: " + colorRedEsc + normalMed + colorResetEsc);
        }
    }
}