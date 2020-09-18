import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		float x;
		float y;
		float media;
		Scanner s = new Scanner(System.in);
		
		x = s.nextFloat();
		y = s.nextFloat();
		media = (x+y)/2;
		System.out.println("media = "+media);
	}
}
