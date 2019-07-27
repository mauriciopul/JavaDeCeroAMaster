public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Mauricio");
        Persona persona3 = new Persona("Jose");
        Persona persona4 = new Persona("Raul");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);

        System.out.println("ContadorPersonas: "+ Persona.getContadorPersonas());

    }
}

class Persona {
    private int idPersona;
    private String nombre;
    public static int contadorPersonas;

    public Persona(String nombre) {
        this.idPersona = contadorPersonas++;
        this.nombre = nombre;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nId: "+idPersona;
    }
}