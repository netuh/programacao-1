import java.util.Scanner;

public class Multa {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
	    float velo_carro, velo_via, relacao;
	    velo_via = s.nextFloat();
	    velo_carro = s.nextFloat();
	    relacao = velo_carro/velo_via;
	    if (relacao>1) {
	    	if (relacao > 1 && relacao <= 1.2) {
	    		String numero =  String.format("%.2f", 85.13);
		    	System.out.println(numero);
		    	System.out.println(4);
	    	} else if (relacao > 1.2 && relacao <=1.5) {
	    		String numero =  String.format("%.2f", 127.69);
				System.out.println(numero);
				System.out.println(5);
	    	} else {
	    		String numero =  String.format("%.2f", 574.62);
			  	System.out.println(numero);
			   	System.out.println(7);
	    	}
	    } else {
	    	String numero =  String.format("%.2f", 0.0);
	    	System.out.println(numero); //0.00
	    	System.out.println(0);
	    }
	    
	}
}
