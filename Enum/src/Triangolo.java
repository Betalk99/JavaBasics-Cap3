public class Triangolo extends Forma{
    private double base;
    private double altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        super(TipoForma.triangolo);
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double calcolaArea(){
        return base*altezza / 2;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                ", tipo=" + getTipo() +
                '}';
    }
}
