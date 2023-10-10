public class Rettangolo implements Forma{
    private double base;
    private double altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        double risultato = base*altezza;
        System.out.println("Il risultato è : " + risultato);
    }
}
