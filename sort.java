package prac;

import java.util.Arrays;

public class bub {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
 private static void bubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean t = false;
            for (int j = 1; j < arr.length - i; j++) {
                int temp = 0;
                if (arr[j] < arr[j - 1]) {

                    temp = arr[i];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    t = true;

                }
            }
            if(t==false)
                break;;
        }

    }
}
 for (int j = 1; j < arr.length - i; j++) {
                int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            boolean t = false;
            for (int j = 1; j < arr.length - i; j++) {
                int temp = 0;
                if (arr[j] < arr[j - 1]) {

                    temp = arr[i];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    t = true;

                }
            }
            if(t==false)
                break;;
