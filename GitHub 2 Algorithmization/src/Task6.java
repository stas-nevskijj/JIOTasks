
public class Task6 {

	public static void main(String[] args) {
		//double[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		double[] arr = {1,2};
		System.out.println(fun(arr));

	}
	public static double fun(double[] arr) {
		double sum = 0;		
		if (arr.length == 2)
		return arr[1];
		if (arr.length > 2) {
			sum+= arr[1];
		for (int i = 2; i < arr.length; i++) {
			boolean isSimple = true;
			for (int j = 2; j < i + 1; j++) {
				if ((i + 1) % j == 0) {
					isSimple = false;
					break;
				}
			}
			if (isSimple)
				sum+= arr[i];
		}
		return sum;
	}
		else return 0;
	}

}
