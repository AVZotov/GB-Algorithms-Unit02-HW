package Seminar002.HW;

import Seminar002.CW.Seminar.ArrayUtils;
import Seminar002.HW.HeapSort.HeapSort;

public class Main {
    public static void main(String[] args) {
        int[] array = ArrayUtils.getArray(30);
        ArrayUtils.print(array);
        HeapSort.sort(array);
        ArrayUtils.print(array);
    }
}
