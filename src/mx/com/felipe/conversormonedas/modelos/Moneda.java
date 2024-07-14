package mx.com.felipe.conversormonedas.modelos;

public class Moneda {


    private String monedaBase;
    private String monedaCambio;
    private double tipoCambiomonedaBase;
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public Moneda(MonedaCambio monedaCambio) {
        this.monedaBase = monedaCambio.base_code();
        this.monedaCambio = monedaCambio.target_code();
        this.tipoCambiomonedaBase = monedaCambio.conversion_rate();
        this.resultado = monedaCambio.conversion_result();
    }

    @Override
    public String toString() {
        return "Moneda Base =" + monedaBase +
                ", Moneda cambio=" + monedaCambio +
                ", Tipo cambio moneda base=" + tipoCambiomonedaBase +
                ", Resultado de tipo de cambio=" + resultado +
                '}';
    }
}
