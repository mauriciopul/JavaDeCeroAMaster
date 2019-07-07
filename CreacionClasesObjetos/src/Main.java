public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.nombre = "Mauricio";
        p1.apelidoPaterno="Pulgarin";
        p1.apellidoMaterno = "Araque";
        p1.mostrarNombre();
        System.out.println();

        p2.nombre="Andres";
        p2.apelidoPaterno="Rua";
        p2.mostrarNombre();
    }
}
