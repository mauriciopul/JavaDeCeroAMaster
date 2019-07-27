public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
