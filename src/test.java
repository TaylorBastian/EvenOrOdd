import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer:");
		x = sc.nextInt();
		if ((x & 1) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
