import java.util.Scanner;

public class ExemploArray{

    public static void main(String[] args) {
        int array[] = new int[100];
        Scanner s = new Scanner(System.in);
        
        int num = 10;
        int cont = 0;
        while(num > 0){
            System.out.println("Digite um num");
            num = s.nextInt();
            cont++;
        }

        int array2[] = new int[cont];

        System.out.println("Digite um num");
        num = s.nextInt();
        
        int array3[] = new int[num];

        System.out.println("digite o numero a ser inserido");
        int num2 = s.nextInt();

        System.out.println("digite o indice do numero a ser inserido");
        int indice = s.nextInt();

        array3[indice] = num2;

        System.out.println("digite o valor a ser inserido no indice 4");
        array[4] = s.nextInt();

    }
}