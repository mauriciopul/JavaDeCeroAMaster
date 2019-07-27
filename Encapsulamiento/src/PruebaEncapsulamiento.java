public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Mauricio", "Pulgarin", true);
        //System.out.println(persona1.nombre);
        System.out.println(persona1);//se llama al metodo toString
        //System.out.println(persona1.getApellido());
        persona1.setApellido("Araque");
        //System.out.println(persona1.getApellido());
        System.out.println(persona1);
    }
}
