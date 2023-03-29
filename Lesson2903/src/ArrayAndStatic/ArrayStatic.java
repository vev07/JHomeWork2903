package ArrayAndStatic;

/*
    1) Создать класс для работы с массивом через статические переменные
    2) Создать класс для работы с массивом через объекты - нестатические переменные
 */

import java.util.Arrays;

public class ArrayStatic {
    public static void main(String[] args) {
        int[] arr = {12,34,45,56,67,78};

        int[] arr1 = copyWithFor(arr);
        int[] arr2 = new int[arr.length];
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = arr.clone();
        System.arraycopy(arr,0,arr2,0,arr.length);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1) + " It is my method create");
        System.out.println(Arrays.toString(arr2)  + " It is System.arraycopy() method");
        System.out.println(Arrays.toString(arr3)  + " It is Arrays.copyOf method");
        System.out.println(Arrays.toString(arr3)  + " It is arr.clone() method");
    }
    public static int[] copyWithFor(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

}
