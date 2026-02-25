public class HijaAnimal extends Animal {
    // Atributo para la Hija
    protected String raza;

     // Constructor de la Hija
    public HijaAnimal(String nombre, int edad, String raza) {

        // Llamar al constructor del Animal
        super(nombre, edad);

        // Constructor de la Hija
        this.raza = raza;
    }
     // Polimorfismo
    @Override
    public void hacerSonido() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Raza: " + this.raza);
        System.out.println("Sonido: La perrita ladra");
    }
}