package Seminar002.HW.Utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    private static final Random random = new Random();

    public static int[] getArray(){
        return getArray(random.nextInt(10, 16));
    }

    public static int[] getArray(int arrayLength){
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-99, 100);
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println("array = " + Arrays.toString(array));
    }
}
