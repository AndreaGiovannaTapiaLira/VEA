public class HijaVehicul extends Vehicul {
    // Atributo para la Hija
    protected String cilindrada;

    // Constructor de la Hija
    public HijaVehicul(String marca, String modelo, String velmax, String cilidrada) {

        // Llamar al constructor del Vehicul
        super(marca, modelo, velmax);

        // Constructor de la Hija
        this.cilindrada = cilindrada;
    }

    // Polimorfismo
    @Override
    public void mostrarinformacion() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad Máxima: " + this.velmax);
        System.out.println("Cilindrara: " + this.cilindrada);
    }
}