
public class interfaces implements Aritmeticos {
     
    public static void main(String[] args) {
        System.out.println(new interfaces().suma(10, 10));
        System.out.println(new interfaces().resta(20, 10));
        System.out.println(new interfaces().multiplicacion(10, 5));
        System.out.println(new interfaces().division(20, 5));
    }

    public int suma(int x, int y) {
        return x + y;
    }

    public int resta(int x, int y) {
        return x - y;
    }

    public int multiplicacion(int x, int y) {
        return x * y;
    }

    public float division(int x, int y) {
        return x / y; 
    }
}

    interface Aritmeticos {
    public int suma(int x, int y);
    public int resta(int x, int y);
    public int multiplicacion(int x, int y);
    public float division(int x, int y); 
}
