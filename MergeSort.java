import java.util.*;
class MergeSort
{
	public static void main(String[] args){
	    int[] arr = {1,7,8,4,2,3};
	    int n = arr.length;
	    sort(arr,0,n-1);
	    System.out.println(Arrays.toString(arr));

	}

	public static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
            
        }
    }
    public static void merge(int arr[], int low, int mid, int high)
    {
        // Find sizes of two subarrays to be merged
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
        
