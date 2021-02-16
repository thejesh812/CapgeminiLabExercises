package Lab;

import java.util.Scanner;

public class PowOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		System.out.println("enter n value: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextDouble();

		while (n % 2 == 0) {
			n = n / 2;
		}
		System.out.println(n == 1);
	}
}
