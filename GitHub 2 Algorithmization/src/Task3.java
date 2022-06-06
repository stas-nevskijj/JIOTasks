import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		double[] arr = {1, 5, 7, 2, 31, 81, 14, 5};
		System.out.println(Arrays.toString(foo(arr)));

	}
	
	public static double[] foo(double[] arr) {
		double c;
		int low = 0;
		int high = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[low] >= arr[i])
				low = i;
			if (arr[high] < arr[i])
				high = i;
		}	
		c = arr[low];
		arr[low] = arr[high];
		arr[high] = c;
		return arr;
	}

}
