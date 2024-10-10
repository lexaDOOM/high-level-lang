package edu.penzgtu;

public class MergeSort {
    // Method to sort the array using Merge Sort
    public void sort(int[] array) {
        if (array.length < 2) {
            return;  // If the array length is less than 2, it is already sorted
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Split the array into two halves
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort each half
        sort(left);
        sort(right);

        // Merge the sorted halves
        merge(array, left, right);
    }

    // Method to merge two sorted subarrays
    private void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays until one of them is fully processed
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Add any remaining elements from the left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Add any remaining elements from the right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
}
