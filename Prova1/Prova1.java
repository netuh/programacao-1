import java.util.Scanner;

public class Prova1{
    public static void main(String[] args) {
        int pacientes, novosPacientes, pacienteAlta;
        int quartosOcupados;
        int quantidadeTotal = 0;
        int quantidadeDeDias = 0;
        int quantidadeMaxima = 0;
        float media;
        char resposta = 's';
        char respostaInicio  = 's';
        Scanner s = new Scanner(System.in);

        do{
            quantidadeTotal = 0;
            quantidadeDeDias = 0;
            quantidadeMaxima = 0;
            pacientes = 0;
            System.out.println("Digite a quantidade de leitos ocupados atualmente:");
            pacientes = s.nextInt();
            while(pacientes < 0){
                System.out.println("A quantidade de leitos deve ser maior que ZERO");
                System.out.println("Digite novamente");
                pacientes = s.nextInt();
            }
            quantidadeTotal = pacientes;

            do{
                System.out.println("Digite a quantidade novos pacientes:");
                novosPacientes = s.nextInt();
                System.out.println("Digite a quantidade de pacientes que receberam alta:");
                pacienteAlta = s.nextInt();
                //pacientes = pacientes + novosPacientes - pacienteAlta;
                pacientes += novosPacientes - pacienteAlta;
                //quartosOcupados = pacientes/2 + pacientes%2;
                if(pacientes%2 == 0){
                    quartosOcupados = pacientes/2;
                }else{
                    quartosOcupados = pacientes/2 + 1;
                }

                if (novosPacientes > quantidadeMaxima){
                    quantidadeMaxima = novosPacientes;
                }
                quantidadeTotal += novosPacientes;
                quantidadeDeDias++;

                if (quartosOcupados > 1983){
                    System.out.println("Quantidade máxima de quartos atingida");
                    System.out.println("Medidas sanitárias devem ser feitas!");
                    pacientes = 1983*2;
                }else{
                    System.out.println("Quartos disponíveis:"+(1983-quartosOcupados));
                }
                //calculo
                System.out.println("Deseja entrar com novos dados?");
                resposta = s.next().charAt(0);
            } while (resposta == 's');

            System.out.println("a maior entrada foi "+quantidadeMaxima);
            media = quantidadeTotal/(float)quantidadeDeDias;
            System.out.println("média de entrada "+media);

            System.out.println("Deseja realizar nova analise?");
            respostaInicio = s.next().charAt(0);
        } while (respostaInicio == 's');
    }
}