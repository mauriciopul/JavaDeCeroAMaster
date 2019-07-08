public class Main {
    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        int resultado1 = caja1.calcularVolumen();
        System.out.println("resultado1 = " + resultado1);
        System.out.println();

        Caja caja2 = new Caja(3, 2, 6);
        int resultado2 = caja2.calcularVolumen();
        System.out.println("resultado2 = " + resultado2);
    }
}
