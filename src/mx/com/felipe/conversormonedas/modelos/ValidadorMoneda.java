package mx.com.felipe.conversormonedas.modelos;

import java.util.regex.Pattern;
public class ValidadorMoneda {

    private static final Pattern PATRON_MONEDA = Pattern.compile("^(USD|ARS|BRL|COP|EUR|MXN)$");

    public boolean esMonedaValida(String moneda) {
        return PATRON_MONEDA.matcher(moneda).matches();
    }

}
