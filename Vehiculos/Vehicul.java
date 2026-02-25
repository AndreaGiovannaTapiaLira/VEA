public class Vehicul{
    // Atributos
    protected String marca;
    protected String modelo;
    protected String velmax;

    // Constructor
    public Vehicul(String marca, String modelo, String velmax){
        this.marca = marca;
        this.modelo = modelo;
        this.velmax = velmax;
    }

    // Mátodo del Vehicul
    public void mostrarinformacion(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad Máxima: " + this.velmax);
    }
}