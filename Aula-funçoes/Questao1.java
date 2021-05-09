import java.util.Scanner;

public class Questao1{

    public static float somaImposto (float taxaImposto, float custo){
        float valorTotal = custo + custo*taxaImposto;
        return valorTotal;
    }

    public static void somaImpostoDePaulo (float taxaImposto, float custo){
        float valorTotal = custo + custo*taxaImposto;
        System.out.println("o valor total é "+valorTotal);
    }

    public static boolean ehPar (int numero){
        if (numero % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float custoMain;
        float taxa;
        
        System.out.println("digite o custo do produto");
        custoMain = s.nextFloat();
        System.out.println("digite a taxa");
        taxa = s.nextFloat();

        somaImpostoDePaulo(taxa,custoMain);
        float custoTotal = somaImposto(taxa,custoMain);

        // System.out.println("custo total "+custoTotal);
    }
}