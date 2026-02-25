public class Animal{
    // Atributos
    protected String nombre;
    protected int edad;

    // Constructor
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Mátodo del Animal
    public void hacerSonido(){
        System.out.println("El animal hace un sonido.");
    }
}