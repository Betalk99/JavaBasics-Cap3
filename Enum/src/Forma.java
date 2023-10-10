enum TipoForma{
    rettangolo,
    triangolo
}

public class Forma {

    private TipoForma tipo;

    public Forma(TipoForma tipo) {
        this.tipo = tipo;
    }

    public TipoForma getTipo() {
        return tipo;
    }

    public double calcolaArea(){ return 0;}


}
