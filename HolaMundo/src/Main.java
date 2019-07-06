import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        String saludo = ("Hola Mundo, Adios");
        System.out.println(saludo);
        System.out.println();
        String s = "Despedirse";
        System.out.println(s);
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre:\t");
        String usuario = scanner.next();//Pedir el valor por consola
        System.out.println("\nHola "+usuario);
    }
}
