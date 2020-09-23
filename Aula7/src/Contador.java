
public class Contador {
	public static void main(String[] args) {

		int num, numMenos1;
		num = 0;

		while (num <= 100) {
			numMenos1 = (num - 1);
			System.out.println("Este é o número " + num + " QUE É MAIOR DO QUE O " + numMenos1);
			num = num + 1;
		}

	}
}
