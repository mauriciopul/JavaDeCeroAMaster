public class Persona {
    //Atributos de una clase

    String nombre = "";
    String apelidoPaterno = "";
    String apellidoMaterno = "";

    //Metodos de la clase


    public void mostrarNombre() {
        if (nombre != "") {
            System.out.println("nombre = " + nombre);
        }
        if (apelidoPaterno != "") {
            System.out.println("apelidoPaterno = " + apelidoPaterno);
        }
        if (apellidoMaterno != "") {
            System.out.println("apellidoMaterno = " + apellidoMaterno);
        }
    }


}
