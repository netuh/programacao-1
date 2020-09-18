import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numero, quantNotas;
		float valorEmReais;
		float valorDoResto;
		int restoPagamento;
		System.out.print("Digite o valor: ");
		valorEmReais = s.nextFloat();
		numero = Math.round(valorEmReais);
		quantNotas = numero / 10;
		restoPagamento = numero % 10;
		valorDoResto = valorEmReais - (quantNotas*10);
		
		System.out.println("Numero: " + numero);
		System.out.println("São " + quantNotas + " notas de R$10,00");
		System.out.println("R$ " + valorDoResto + " não seriam pagos");
	}
}
