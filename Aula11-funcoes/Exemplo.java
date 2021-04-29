import java.util.Scanner;

public class Exemplo{


    // f(x) = 2x + 5
    public static void funcao(int x){
        System.out.println(2*x + 5);
    }

    public static void escreverOi(String nome){
        System.out.println("oi "+nome);
    }

    public static void escreverOiCompleto(String nome, String sobrenome){
        System.out.println("oi "+nome+  " " + sobrenome);
    }

    public static void main(String[] args) {
        // String nome2;
        // Scanner s = new Scanner (System.in);
        // System.out.println("digite seu nome");
        // nome2 = s.nextLine();
        // String nomeProf = "Waldemar";
        // System.out.println("antes");
        // escreverOi("Neto");
        // escreverOi(nomeProf);
        // escreverOi(nome2);
        // escreverOiCompleto("Waldemar", "Pires");
        // escreverOiCompleto(nomeProf, "Ferreira");
        // System.out.println("depois");

        funcao(2);
    }
}