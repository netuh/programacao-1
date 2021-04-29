public class Global{

    static int x;

    public static void proc(){
        x = 2;
    }

    public static void main(String[] args) {
        x = 1;
        System.out.println(x);
        proc();
        System.out.println(x);
    }
}