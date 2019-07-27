public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona per1 = new Persona("Mauricio", 35);
        System.out.println("per1 = " + per1);
        Empleado emp1 = new Empleado("Andres", 34, 2500);
        System.out.println("emp1 = " + emp1);
    }
}
