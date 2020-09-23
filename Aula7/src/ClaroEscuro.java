import java.util.Scanner;

public class ClaroEscuro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hora;

		System.out.println("Digite a hora");
		hora = s.nextInt();
		while (hora <0 || hora >24) {
			System.out.println("Hora Inválida Digite novamente:");
			hora = s.nextInt();
		}
	
		if (hora < 5 || hora > 18) {
			System.out.println("Escuro");
		} else {
			System.out.println("Claro");
		}
//		if (hora > 5 && hora < 18) {
//			System.out.println("Claro");
//		} else {
//			System.out.println("Escuro");
//		}
	}
}
