
public class Loop {
	public static void main(String[] args) {
		int num = 1;
		
		while (num < 100) {
			System.out.println(num+" eh menor que 100");
			num = num +1;
			if (num > 50) {
				System.out.println(num+" eh maior que 50");
			}
		}
		System.out.println("Essa mensagem vai aparecer");
	}
}
