
public class Task5 {

	public static void main(String[] args) {
		int[] arr = {1,4,7,2,8,10,5,7,0,12};
		fun(arr);

	}
	
	public static void fun(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i)
				System.out.println(arr[i]);
		}
	}

}
