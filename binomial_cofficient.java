import java.util.*;

public class binomial_cofficient {
	public static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;
	}

	public static int bincof(int n, int r) {
		int facto_n = fact(n);
		int facto_r = fact(r);
		int facto_nmr = fact(n - r);
		int bincof = facto_n / (facto_r * facto_nmr);
		return bincof;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome in Binomial Cofficient Program");
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		System.out.println("Enter the value of r : ");
		int r = sc.nextInt();
		bincof(n,r);
		System.out.println("Binomial factorial of " + n + " and " + r + " :" +bincof(n,r));
	}

}
