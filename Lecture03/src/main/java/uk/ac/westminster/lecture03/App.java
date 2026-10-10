package uk.ac.westminster.lecture03;

public class App {

	private static final int SIZE = 10;
	public static void main(String[] args) {
		int[] nums = new int[SIZE];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Enter a number for index " + i + ": ");
			nums[i] = scanner.nextInt();
		}

		scanner.close();

		Arrays.sort(nums);

		System.out.println("The sorted numbers are: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
