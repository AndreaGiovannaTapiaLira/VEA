public class Main3{
    public static void main(String[] args) {
        Animal animal1 = new Animal("Animal Génerico", 3);
        animal1.hacerSonido();
        System.out.println("--------------------------------");
        HijaAnimal hija = new HijaAnimal("Luna", 6, "Labrador");
        hija.hacerSonido();
    }
}