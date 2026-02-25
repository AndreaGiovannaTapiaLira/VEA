public class Main{
    public static void main(String[] args) {
        Vehicul carro = new Vehicul("Hennessey", "Venom F5", "484 - 499 km/h");
        carro.mostrarinformacion();
        System.out.println("--------------------------------");
        HijaVehicul hijo = new HijaVehicul("Bugatti", "Chiron Super Sport", "440 km/h (limitada)", "8.0 Litros (8000 cc)");
        hijo.mostrarinformacion();
    }
}