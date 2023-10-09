public class Main {
    public static void main(String[] args) {

        Animale animale = new Animale();
        Gatto gatto = new Gatto();
        Cane cane = new Cane();

        System.out.println("Verso Animale: ");
        animale.faiIlVerso();
        System.out.println("Verso Gatto: ");
        gatto.faiIlVerso();
        System.out.println("Verso Cane: ");
        cane.faiIlVerso();
    }
}