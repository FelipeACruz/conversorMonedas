package mx.com.felipe.conversormonedas.modelos;

public record MonedaCambio(String base_code,
                           String target_code,
                           Double conversion_rate,
                           Double conversion_result) {

}
