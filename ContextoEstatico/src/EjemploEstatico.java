public class EjemploEstatico {
    public static void main(String[] args) {

    }
}



class Persona{
    private int idPersona;
    private String nombre;
    public static int contadorPersonas;

    public Persona(String nombre){
        contadorPersonas++;
        this.nombre = nombre;
    }
}