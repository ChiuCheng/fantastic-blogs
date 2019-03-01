package com.coding.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[]{20,1,6,5,0};
        bucketSort(arr);
        Arrays.stream(arr).forEach(x -> System.out.print(x + ", "));
    }

    private static void swap(int[] arr, int i1, int i2) {
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

    // ==============冒泡排序（Bubble Sort）==============
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    // ==============选择排序（Selection Sort）==============
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }

            swap(arr, i, minIndex);
        }
    }

    // ==============插入排序（Insertion Sort）==============
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int current = arr[i];
            while (j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    // ==============归并排序（Merge Sort）==============
    public static void mergeSort(int[] arr) {
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    public static void mergeSortHelper(int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        if (start < end) {
            mergeSortHelper(arr, start, mid);
            mergeSortHelper(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int[] tmp = new int[end - start + 1];
        int i = start, j = middle + 1;
        int k = 0;
        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                tmp[k++] = arr[i++];
            } else {
                tmp[k++] = arr[j++];
            }
        }
        while (i <= middle)
            tmp[k++] = arr[i++];

        while (j <= end)
            tmp[k++] = arr[j++];

        k = 0;
        while (k < end - start + 1) {
            arr[start + k] = tmp[k];
            k++;
        }
    }

    // ==============快速排序（Quick Sort）==============
    public static void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    public static void quickSortHelper(int[] arr, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(arr, start, end);
            quickSortHelper(arr, start, partitionIndex - 1);
            quickSortHelper(arr, partitionIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = start;
        int index = pivot + 1;
        for (int i = index ; i <= end ; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    // ==============堆排序（Heap Sort）==============
    public static void heapSort(int[] arr) {
        int n = arr.length;
        buildMaxHeap(arr,n);

        for (int i = n-1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, 0, i);
        }
    }

    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = (n-1)/2; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int i, int n) {
        int j = 2 * i + 1;

        while (j < n) {
            if (j + 1 < n && arr[j] < arr[j+1])
                j ++;

            if (arr[i] > arr[j])
                break;

            swap(arr, i, j);

            i = j;
            j = 2 * i + 1;
        }
    }

    // ==============计数排序（Counting Sort）==============
    public static void countingSort(int[] arr) { // only work for positive integers
        int maxValue = Integer.MIN_VALUE;
        for (int a : arr)
            maxValue = Math.max(maxValue, a);

        int[] bucket = new int[maxValue + 1];
        for (int a : arr) {
            bucket[a]++;
        }

        int sortedIndex = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i]-- > 0)
                arr[sortedIndex++] = i;
        }
    }

    // ==============桶排序（Bucket Sort）==============
    public static void bucketSort(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int a : arr) {
            minValue = Math.min(minValue, a);
            maxValue = Math.max(maxValue, a);
        }
        int bucketSize = 10;
        int bucketCount = (maxValue - minValue)/bucketSize + 1;
        List<List<Integer>> bucket = new ArrayList();
        for (int i = 0; i < bucketCount; i++)
            bucket.add(new ArrayList<>());

        // 利用映射函数将数据分配到各个桶中
        for (int a : arr) {
            int bucketIndex = (a - minValue) / bucketSize;
            bucket.get(bucketIndex).add(a);
        }

        //对每个桶进行排序
        int sortedIndex = 0;
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(bucket.get(i));
            for (int j = 0; j < bucket.get(i).size(); j++)
                arr[sortedIndex++] = bucket.get(i).get(j);
        }
    }

    // ==============基数排序（Radix Sort）==============
    public static void radixSort(int[] arr) {
        int mod = 10;
        int dev = 1;
        int maxDigit = 3;
        List<List<Integer>> counter = new ArrayList<>();

        for (int i = 0; i < maxDigit; i++, mod *= 10, dev *= 10) {
            for (int j = 0; j < 10; j++)
                counter.add(new ArrayList());
            for (int a : arr) {
                int bucketIndex = (a%mod) / dev;
                counter.get(bucketIndex).add(a);
            }

            int pos = 0;
            for (int m = 0; m < 10; m++) {
                for (int n = 0; n < counter.get(m).size(); n++)
                    arr[pos++] = counter.get(m).get(n);
                counter.get(m).clear();
            }

        }
    }
}
