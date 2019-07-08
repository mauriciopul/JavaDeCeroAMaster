public class Main {
    public static void main(String[] args) {

        int operandoA = 6;
        int operandoB = 2;

        Aritmetica op1 = new Aritmetica(operandoA, operandoB);
        System.out.println("Sumar = " + op1.sumar());
        System.out.println("Restar = " + op1.restar());
        System.out.println("Multiplicar = " + op1.multiplicar());
        System.out.println("Dividir = " + op1.divivid());


    }
}
