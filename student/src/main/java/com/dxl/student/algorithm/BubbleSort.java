package com.dxl.student.algorithm;

public class BubbleSort implements Sortor {
    /**
     * 冒泡排序
     *
     * @param array
     */
    public void sort(int[] array) {
        int length = array.length;
        int count = 0;
        for (int i = 0; i < length - 1; i++) {
            boolean sortFlag = true;
            for (int j = 0; j < length - 1 - i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    sortFlag = false;
                }
            }
            if (sortFlag) {
                break;
            }
        }
        System.out.println("总共循环次数：" + count);
    }
}
