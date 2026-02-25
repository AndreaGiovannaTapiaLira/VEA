public class HijaEmpleado extends Empleado {
    // Atributo para la Hija
    protected double bono;

     // Constructor de la Hija
    public HijaEmpleado(String nombre, double salario, double bono) {

        // Llamar al constructor del Empleado
        super(nombre, salario);

        // Constructor de la Hija
        this.bono = bono;
    }
    // Polimorfismo
    @Override
    public void calcularSalario() {
        double salarioTotal = salario + bono; // Accedemos al salario (protected)
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario Base: $" + this.salario);
        System.out.println("Bono: $" + this.bono);
        System.out.println("Salario Total: $" + salarioTotal);
    }
}