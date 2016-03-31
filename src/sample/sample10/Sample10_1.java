package sample.sample10;

import static java.util.Arrays.binarySearch;

/**
 * Created by mainshinya on 2016/03/31.
 */
public class Sample10_1 {
    public static void SearchEvenNumber(int[] boxnumbers) {
        int counter = 0;
        for (int val : boxnumbers){
                if((val & 1) == 0){
                    counter++;
                }
        }
        System.out.println("偶数は"+ counter + "個ありました。");
    }
}
