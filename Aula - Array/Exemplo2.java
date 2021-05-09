import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        float somatorio = 0;
        float numero = 0,media;
        Scanner s = new Scanner (System.in);

        for (int i = 0; i < 100; i++) {
            System.out.println("digite um numero");
            numero = s.nextFloat();
            somatorio += numero;
        }
        media = somatorio /100;
        System.out.println("media é "+media);
    }
}
