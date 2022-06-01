import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		double[] arr = {5, 2, 5, 16, 12, 62, 45, 9, 18};
		System.out.println(Arrays.toString(fun(arr, 12)));

	}
	
	public static double[] fun(double[] input, double z) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > z) {
				 input[i]= z;
				count++;
			}			
		}
		System.out.println("Nums of replacements is " + count);
		return input;
	}

}
