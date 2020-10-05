import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		int voto;
		char resposta;
		int votosCand1 = 0, votosCand2 = 0, votosCand3 = 0;
		float percentCand1, percentCand2, percentCand3;
		Scanner s = new Scanner(System.in);
		
//		votosCand1 = 0;
//		votosCand2 = 0;
//		votosCand3 = 0;
		
		//votosCand1 = votosCand2 = votosCand3 = 0;
		
//		voto = -1;
//		while (voto < 1 || voto >3) {
//			System.out.println("Digite seu voto (1, 2 ou 3):");
//			voto = s.nextInt();
//			//if (voto <1 || voto > 3)
//			if (voto != 1 && voto != 2 && voto != 3) {
//				System.out.println("Digite um voto válido (1, 2 ou 3)");
//			}
//		}
//		
//		
//		System.out.println("Digite seu voto (1, 2 ou 3):");
//		voto = s.nextInt();
//		while (voto < 1 || voto >3) {
//			System.out.println("Digite um voto válido (1, 2 ou 3)");
//			System.out.println("Digite seu voto (1, 2 ou 3):");
//			voto = s.nextInt();
//		}
		
//		resposta = 's';
//		while(resposta == 's') {
//			do {
//				System.out.println("Digite seu voto (1, 2 ou 3):");
//				voto = s.nextInt();
//				//if (voto <1 || voto > 3)
//				if (voto != 1 && voto != 2 && voto != 3) {
//					System.out.println("Digite um voto válido (1, 2 ou 3)");
//				}
//			}while (voto < 1 || voto >3);
//			
//			System.out.println("Deseja votar novamente? (s/n)");
//			resposta = s.next().charAt(0);
//		}
		
		
		resposta = 's';
		while(resposta == 's') {
			System.out.println("Digite seu voto (1, 2 ou 3):");
			voto = s.nextInt();
			while (voto < 1 || voto >3) {
				System.out.println("Digite um voto válido (1, 2 ou 3)");
				System.out.println("Digite seu voto (1, 2 ou 3):");
				voto = s.nextInt();
			}
			if (voto == 1) {
				votosCand1 = votosCand1 + 1;
//				votosCand1++;
//				votosCand1 += 1;
			}
			if (voto == 2) {
				votosCand2 = votosCand2 + 1;
			}
			if (voto == 3) {
				votosCand3 = votosCand3 + 1;
			}
			System.out.println("Deseja votar novamente? (s/n)");
			resposta = s.next().charAt(0);
		}
		
		percentCand1 = (votosCand1/(float)(votosCand1+votosCand2+votosCand3))*100;
		System.out.println("o percentual do candidato 1 é " + percentCand1);
		percentCand2 = ((float)votosCand2/(votosCand1+votosCand2+votosCand3))*100;
		System.out.println("o percentual do candidato 2 é " + percentCand2);
		percentCand3 = (votosCand3/(float)(votosCand1+votosCand2+votosCand3))*100;
		System.out.println("o percentual do candidato 3 é " + percentCand3);
		
		if (percentCand1 > 50) {
			System.out.println("Vencedor Candidato 1");
		}
		if (percentCand2 > 50) {
			System.out.println("Vencedor Candidato 2");
		}
		if (percentCand3 > 50) {
			System.out.println("Vencedor Candidato 3");
		} 
		if (percentCand1 < 50 && percentCand2 < 50 && percentCand3 < 50){
			System.out.println("Segundo Turno");
		}
		
		if (percentCand1 > 50) {
			System.out.println("Vencedor Candidato 1");
		} else if (percentCand2 > 50) {
			System.out.println("Vencedor Candidato 2");
		} else if (percentCand3 > 50) {
			System.out.println("Vencedor Candidato 3");
		} else {
			System.out.println("Segundo Turno");
		}
		
		
		
		System.out.println("Acabou!");
	}
}
