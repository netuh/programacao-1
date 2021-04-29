public class Baskara {
    
    public static float delta(float a, float b, float c){
        float d = b*b - 4*a*c;
        System.out.println(d);
        return d;
    }

    public static void raizPrimeira(float a, float b, float delta){
        double x1 = (-b + Math.sqrt(delta) ) / (2*a);
        System.out.println(x1);
    }

    public static void main(String[] args) {
        float a = 2;
        float b = -6;
        float c = 0;
        float d;

        d = delta(a,b,c);
        raizPrimeira(a, b, d);
    }
}
