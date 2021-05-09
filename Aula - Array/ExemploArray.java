public class ExemploArray {
    public static void main(String[] args) {
        int numero = 3;

        int array [] = new int[10];

        array[0] = 10;
        array[1] = 10;
        array[2] = 20;
        array[numero] = 20;

        //               0 1 2 3 4 5 6 
        int array2 [] = {1,2,3,4,5,6,7};
        for (int i = 0; i < 7; i++) {
            System.out.println(array2[i]);
        }
    }
}
