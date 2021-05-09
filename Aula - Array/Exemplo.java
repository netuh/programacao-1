public class Exemplo {
    
    public static boolean testaMultiplo(int num1, int num2){
        if (num1 % num2 == 0){
            return true;
        } else {
            return false;
        }
        
    }

    public static void testaMultiploVoid(int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("é multiplo");
        } else {
            System.out.println("não é multiplo");
        }
        
    }

    public static boolean testaMultiplo4(int num1){
        return testaMultiplo(num1, 4);
    }
    
    public static void main(String[] args) {
        boolean a;
        int c;
        char letra;
        float real;
        a = testaMultiplo(4, 5);
        System.out.println(a);
        a = testaMultiplo(8, 4);
        System.out.println(a);
        a = testaMultiplo(12, 3);
        System.out.println(a);
        
        testaMultiploVoid(12, 3);
        
        a = testaMultiplo4(12);
        System.out.println(a);
    }
}