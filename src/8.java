import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println(getGCD(n, m));
		System.out.println(gcd(a, b));
		System.out.println(gcd(c, d));
	}

	public static int getGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a % b);
		}
	}

	public static int gcd(int a, int b) {
		if (a > b) {
			return gcd(a - b, b);
		} else if (a < b) {
			return gcd(b - a, a);
		} else {
			return a;
		}
	}
}