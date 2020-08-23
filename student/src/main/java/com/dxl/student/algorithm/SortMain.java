package com.dxl.student.algorithm;

import java.util.Arrays;

public class SortMain {
    //    private static int[] nums = new int[]{5, 2, 4, 1, 9, 6, 8, 7, 3};
//    private static int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] nums = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        Sortor sortor = SortFactory.getInstance(SortType.BUBBLE, BubbleSort.class);
        assert sortor != null;
        sortor.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
