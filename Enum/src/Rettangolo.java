public class Rettangolo extends Forma{
    private double base;
    private double altezza;

    // Costruttore
    public Rettangolo(double base, double altezza) {
        super(TipoForma.rettangolo);
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){

        return base*altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", tipo=" + getTipo() +
                '}';
    }
}
