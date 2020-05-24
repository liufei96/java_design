package com.yiyang.java;
/**
 * @author Liufei
 * @date 2020/4/11 12:09 上午
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("test");
        int arr[][] = new int[][] { { 1, 2 }, { 4, 5}, { 7, 8} };
        System.out.println("行列互调前：" + arr.length);
        printArray(arr);
        int arr2[][] = new int[2][3];
        for (int i = 0;i < arr.length;i++) {
            for (int j = 0;j < arr[i].length;j++) {
                arr2[j][i] = arr[i][j];
            }
        }
        System.out.println("行列互调后：" + arr2.length);
        printArray(arr2);
    }

    /**
     * 遍历数组并输出数组的全部元素
     */
    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();	//换行
        }
    }
}
