import java.util.*;
class QuickSort{
	public static void main(String[] args) {
		int[] arr = { 3,5,2,6,1,7};
		int n = arr.length;
		Quick(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void Quick(int[] arr, int low, int high){

		if ( low < high){
			int partion = partion(arr,low,high);
			Quick(arr,low,partion-1);
			Quick(arr,partion+1,high);
		}

	}
	public static int partion(int[] arr, int low, int high){
		int pivot = arr[low];
		int i = low+1;
		int j = high;

		while ( i <= j){
			while (i <= high && arr[i] <= pivot ){
				i++;
			}

			while (j >= low &&  arr[j] >= pivot ){
				j--; 
			}

			if ( i < j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

	    arr[low] = arr[j];
	    arr[j] = pivot;
		return j;
	}
}
