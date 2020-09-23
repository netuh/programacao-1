import java.util.Scanner;

public class CentDezUni {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int centenas;
		int dezenas;
		int unidades;
		int numero;
		
		System.out.println("Digite um número");
		numero = s.nextInt();
		while (numero > 100 && numero < 999) {
			System.out.println("Digite um número entre 100 e 999:");
			numero = s.nextInt();
		}
		centenas = numero / 100;
		dezenas = (numero % 100) / 10;
		unidades = ((numero % 100) % 10);
		System.out.println("centenas " + centenas);
		System.out.println("dezenas " + dezenas);
		System.out.println("unidades " + unidades);
	}

}
