import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Scanner;
import java.text.*;

public class Main {
    public static void main(String[] args) {
/*
        String saludo = ("Hola Mundo, Adios");
        System.out.println(saludo);
        System.out.println();
        String s = "Despedirse";
        System.out.println(s);
 */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre:\t");
        String usuario = scanner.next();//Pedir el valor por consola
        System.out.println("\nHola "+usuario);
  */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el título:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo +" fue escrito por "+autor);
*/
/*
        //decimal
        var b1 = 10;
        System.out.println("b1 = " + b1);
        //hexadecimal
        var b2 = 0xa;
        System.out.println("b2 = " + b2);
        //octal
        var b3 = 012;
        System.out.println("b3 = " + b3);
 */
/*
//byte, short, int, long
        System.out.println("bits tipo byte:" + Byte.SIZE);
        System.out.println("bytes tipo byte:" + Byte.BYTES);
        System.out.println("valor minimo tipo byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte:" + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo short:" + Short.SIZE);
        System.out.println("bytes tipo short:" + Short.BYTES);
        System.out.println("valor minimo tipo short:" + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short:" + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int:" + Integer.SIZE);
        System.out.println("bytes tipo int:" + Integer.BYTES);
        System.out.println("valor minimo tipo int:" + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int:" + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long:" + Long.SIZE);
        System.out.println("bytes tipo long:" + Long.BYTES);
        System.out.println("valor minimo tipo long:" + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long:" + Long.MAX_VALUE);

        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10;
        System.out.println("numero = " + numero);
 */
/*
    //float, double
        System.out.println("bits tipo float:" + Float.SIZE);
        System.out.println("bytes tipo float:" + Float.BYTES);
        System.out.println("valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo double:" + Double.SIZE);
        System.out.println("bytes tipo double:" + Double.BYTES);
        System.out.println("valor minimo tipo double:" + Double.MIN_VALUE);
        System.out.println("valor maximo tipo double:" + Double.MAX_VALUE);

        float floatVar = 1.05F;
        double doubleVar = 1.0D;

        var floatVar2 = 10.0F;
        var doubleVar2 = 10.15D;
 */
/*
//Indica la cantidad de decimales que queremos ver en un double
//DecimalFormat
        double num1 = 123.33243;
        DecimalFormat df = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, df.format(num1));
        System.out.println(df.format(num1));
//String Format
        double num2 = 123.33243;
        //2 decimales
        System.out.println(String.format("%.2f", num2));
        //3 decimales
        System.out.println(String.format("%.3f", num2));

 */
/*
//float, double
        System.out.println("valor tipo char:" + Character.SIZE);
        System.out.println("valor tipo char:" + Character.BYTES);
        System.out.println("valor minimo tipo float:" + Character.MIN_VALUE);
        System.out.println("valor maximo tipo float:" + Character.MAX_VALUE);
        System.out.println();
        //char c = '@';//los que son tipo CHAR se escriben en commilla simple
        char c = 33;
        System.out.println("c = " + c);//De esta manara se imprime el valor DECIMAL 33 de la tabla unicode
 */
/*
//boolean
        //System.out.println("valor tipo boolean:" + Boolean.SIZE);//El tamaño depende de la arquitectura del pc
        //System.out.println("valor tipo boolean:" + Boolean.BYTES);//El tamaño depende de la arquitectura del pc
        System.out.println("true  tipo boolean:" + Boolean.TRUE);
        System.out.println("false tipo boolean:" + Boolean.FALSE);
        System.out.println();
 */
/*
//Conversión  de datos

        //String a Entero
        int ed = Integer.parseInt("20");
        int s = 15 + ed;
        System.out.println("ed = " + s);

        //String a Entero ingresado por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite su edad:");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);

        //String a Double
        double vlrPi = Double.parseDouble("3.14");
        System.out.println("vlrPi = " + vlrPi);

        //String a Char
        char c = "Hola".charAt(0);
        System.out.println("c = " + c);

        //Entero a String
        String edadTexto = String.valueOf(35);
        System.out.println("edadTexto = " + edadTexto);
 */
/*
//Ejercicio
Se solicita capturar la siguiente información de una tienda de libros:
    nombre (String)
    id (int)
    precio (double)
    simbolo (char)
    envioGratuito (boolean)

Tu tarea es imprimir un mensaje en el siguiente formato:

    Proporciona el nombre:
    Proporciona el id:
    Proporciona el precio:
    Proporciona el simbolo:
    Proporciona el envio gratuito:
    <nombre> #<id>
    Precio: <simbolo><precio>
    Envio Gratuito: <envioGratuito>

Por ejemplo:

    Proporciona el nombre:
    Programacion con Java
    Proporciona el id:
    1520
    Proporciona el precio:
    899
    Proporciona el simbolo:
    $
    Proporciona el envio gratuito:
    true
    Programacion con Java #1520
    Precio: $899.00
    Envio Gratuito: true
 */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el precio: ");
        Double precio = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el simbolo: ");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el envio gratuito:" +
                "\nfalse para NO enviar gratis" +
                "\ntrue para enviar gratis\n");
        boolean envioGratuito = scanner.nextBoolean();
        System.out.println("---------------------------------");

        System.out.println(nombre + " #"+id);
        System.out.println("Precio: "+simbolo+precio);
        System.out.println("Envio gratuito: "+envioGratuito);
 */
/*
//Ejercicio Perimetro y Area
        int alto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto"));
        int ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho"));
        int area = alto * ancho;
        int perim = (alto + ancho) * 2;
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perim);
         */
/*
//Operador Ternario
        int num = 101;
        String resul1 = (num % 2 == 0) ? "Es PAR" : "Es IMPAR";
        System.out.println("resul = " + resul1);

        boolean esPar = (num % 2 == 0) ? true : false;
        System.out.println("Es PAR? = " + esPar);
//Ejercicio de número mayor con operador ternario
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2: "));
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            String mayor = (n1 > n2) ? "El número mayor es: "+n1 : "El número mayor es: "+n2;
            System.out.println(mayor);
        }
 */
/*
//Ejercicio Sistema de calificaciones
El usuario proporcionará un valor entre 0 y 10.
Si está entre 9 y 10: imprimir una A
Si está entre 8 y menor a 9: imprimir una B
Si está entre 7 y menor a 8: imprimir una C
Si está entre 6 y menor a 7: imprimir una D
Si está entre 0 y menor a 6: imprimir una F
cualquier otro valor debe imprimir: Valor desconocido
        boolean salida = false;
        while (salida == false) {
            double nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su nota"));

            if (nota < 0) {
                JOptionPane.showMessageDialog(null, "Ingrese nota válida");
                salida = false;
            } else if (nota < 6) {
                JOptionPane.showMessageDialog(null, "F");
                salida = true;
            } else if (nota < 7) {
                JOptionPane.showMessageDialog(null, "D");
                salida = true;
            } else if (nota < 8) {
                JOptionPane.showMessageDialog(null, "C");
                salida = true;
            } else if (nota < 9) {
                JOptionPane.showMessageDialog(null, "B");
                salida = true;
            } else if (nota <= 10) {
                JOptionPane.showMessageDialog(null, "A");
                salida = true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese nota válida");
                salida = false;
            }
        }//Fin While
 */






    }//fin pulic static void main
}//Fin public class Main