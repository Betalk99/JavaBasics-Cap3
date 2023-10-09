public class Triangolo extends Forma {
    private double base;
    private double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){

        return base*altezza/2;
    }
}
