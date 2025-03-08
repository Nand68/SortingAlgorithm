import java.util.Arrays;

public class SortingAlgorithms {

    // Selection Sort
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            // Swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    // Bubble Sort
    static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();
        
        System.out.println("Original Array: " + Arrays.toString(arr1));
        
        selectionSort(arr1, arr1.length);
        System.out.println("Selection Sort: " + Arrays.toString(arr1));
        
        bubbleSort(arr2, arr2.length);
        System.out.println("Bubble Sort: " + Arrays.toString(arr2));
        
        insertionSort(arr3, arr3.length);
        System.out.println("Insertion Sort: " + Arrays.toString(arr3));
    }
}
