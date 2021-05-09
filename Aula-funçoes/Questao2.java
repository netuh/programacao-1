import java.util.Scanner;

public class Questao2 {
    
    public static void horaAmPm(int hora, int minuto){
        if (hora < 12){
            System.out.println(hora+":"+minuto+"AM");
        } else {
            System.out.println((hora-12)+":"+minuto+"PM");
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hora24;
        int minuto24;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a hora");
            hora24 = s.nextInt();
            System.out.println("Digite os minitos");
            minuto24 = s.nextInt();
            horaAmPm(hora24, minuto24);
        }
    }
}
