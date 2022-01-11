import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int T = scanner.nextInt();
		int C = scanner.nextInt();
		int P = scanner.nextInt();
		System.out.println((N-1) / T * C * P);
	}
}

// the number of starfruits = (N-1)/T*C 
// revenue = the number of starfruits * Price = (N-1)/T*C*P