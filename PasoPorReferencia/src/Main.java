public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.cambiarNombre("Mauricio");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    public static void imprimirNombre(Persona p1){
        System.out.println("Nombre = " + p1.obtenerNombre());
    }
    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Jose");
    }

}
