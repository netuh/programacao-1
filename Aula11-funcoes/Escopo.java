public class Escopo {

    static int z;


    public static int funcao(int x){
        int y = x*x;
        return y;
    }

    public static void proce1(int a){
        a = 1;
        int y = 5;
        System.out.println("o valor de a em proce1 é "+ a);
    }
    public static void main(String[] args) {
        int a = 2; 
        int x = 5;  
        proce1(a);
        System.out.println("o valor de a na main é "+ a);
        int outraVariavel = funcao(2);
        System.out.println("valor de outraVariavel é "+ outraVariavel);
    }
}
