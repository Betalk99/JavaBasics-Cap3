public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){

        return base*altezza;
    }
}
