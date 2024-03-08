// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Kenji", "Herrera",2401);
        Velero velero1 = new Velero(capitan1, 150,15,2019,10.5,5);
        System.out.println("Monto del alquiler del velero: " + velero1.calcularMontoAlquiler());

        Capitan capitan2 = new Capitan("Liliana","Torres", 0799);
        Yate yate1 = new Yate(capitan2, 160, 20, 2022, 15, 4);
        System.out.println("Monto del alquiler del yate 1: " + yate1.calcularMontoAlquiler());
    }
}