import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int altura=1;
		int base=2;
		int area;
		System.out.println("Digite a altura");
		altura = s.nextInt();
		System.out.println("Digite a base");
		base = s.nextInt();
		area = (base*altura)/2;
		System.out.println("Area "+area);
	}
}
