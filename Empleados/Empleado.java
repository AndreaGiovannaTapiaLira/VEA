public class Empleado{
    // Atributos
    protected String nombre;
    protected double salario;

    // Constructor
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    // Mátodo del Empleado
    public void calcularSalario(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Salario Base: $" + this.salario);
    }
}