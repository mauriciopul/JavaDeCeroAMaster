public class Main {
    public static void main(String[] args) {
        int resultado = sumar(3, 6);
        System.out.println("resultado = " + resultado);
    }

    public static int sumar(int a, int b) {
        if (a == 0 & b == 0) {
            System.out.println("Ingrese valores diferentes a '0'");
            return 0;
        }
        return a + b;
    }


}
