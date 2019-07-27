import java.util.Date;

public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Mauricio", 25000);
        emp1.setEdad(35);
        emp1.setGenero('M');
        emp1.setDireccion("Bello, Ant.");
        System.out.println("emp1 = " + emp1);

        Cliente cli1 = new Cliente(new Date(), true);
        cli1.setNombre("Karla");
        cli1.setEdad(31);
        cli1.setGenero('F');
        cli1.setDireccion("Palmas");
        System.out.println("cli1 = " + cli1);

    }
}
