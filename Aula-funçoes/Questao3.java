import java.util.Scanner;

public class Questao3 {
    
    public static int reverte (int num) {
        int numReverso;
        int centenas = num / 100;
        int dezenas = (num % 100) / 10;
        int unidades = num % 10;
        numReverso = unidades*100 + dezenas*10 + centenas;
        return numReverso;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        int numInv;
        for (int i = 0; i < 5; i++) {
            int z = 4;
            System.out.println("Digite um numero");
            num =  s.nextInt();
            numInv = reverte(num);
            System.out.println(numInv);
        }
    }
}
