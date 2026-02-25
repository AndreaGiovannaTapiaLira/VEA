public class Main2{
    public static void main(String[] args) {
        Empleado persona = new Empleado("Juan", 2027);
        persona.calcularSalario();
        System.out.println("--------------------------------");
        HijaEmpleado hija = new HijaEmpleado("Andrea", 1500, 333);
        hija.calcularSalario();
    }
}