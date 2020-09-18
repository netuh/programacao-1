
public class Media {
	
	public static void main(String[] args) {
		float a = 3, b = 1.3f, c;
		
		c = 0.777777f;
		String numero =  String.format("%.2f", c);
		System.out.println("com todas as casas "+ c);
		System.out.println("com duas casas "+ numero);
		
		if (c<0) {
			System.out.println("verdade");
		} else {
			System.out.println("Falso");
		}
		
		System.out.println("Fim");
	}
}
