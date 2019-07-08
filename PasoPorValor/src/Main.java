public class Main {
    public static void main(String[] args) {
        int x = 10;
        imprimir(x);
        cambiarValor(12);
        x=13;
        imprimir(x);
    }

    public static void imprimir(int arg){
        System.out.println("arg = " + arg);
    }
    public static void  cambiarValor(int i){
         i = 12;
    }

}
