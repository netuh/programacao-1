import java.util.Scanner;

public class ExemploArra2 {
    public static void main(String[] args) {
        float somatorio = 0;
        float numero = 0,media;
        float numerosArray [] = new float [100];
        Scanner s = new Scanner (System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("digite um numero");
            numero = s.nextFloat();
            numerosArray [i] = numero;
            somatorio += numero;
        }
        media = somatorio /10;
        System.out.println("media é "+media);

        for (int i = 0; i < 10; i++) {
            if (numerosArray[i] > media){
                System.out.println(numerosArray[i]);
            }
        }
    }
}
