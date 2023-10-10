public class Triangolo implements Forma{
    private double base;
    private double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double risultato = (base*altezza) / 2;
        System.out.println("Il risultato è : " + risultato);
    }
}
