/*
 Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }
 */
import java.util.Arrays;

public class MergeArrays {
    
    static void merge(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int index = m - 1;

        // Move non-zero elements of X to the end
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[index] = X[i];
                index--;
            }
        }

        int i = index + 1;
        int j = 0;
        int k = 0;

        // Merge X and Y into X
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[k++] = X[i++];
            } else {
                X[k++] = Y[j++];
            }
        }

        // Copy remaining elements of Y to X
        while (j < n) {
            X[k++] = Y[j++];
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };

        merge(X, Y);

        System.out.println("Merged array: " + Arrays.toString(X));
    }
}


//OUPUT :  Merged array: [1, 2, 3, 5, 6, 8, 9, 10, 15]


