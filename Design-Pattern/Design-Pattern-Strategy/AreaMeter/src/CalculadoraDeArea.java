

public class CalculadoraDeArea {
    private Forma forma;

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public double calcularArea() {
        return forma.calcularArea();
    }
}