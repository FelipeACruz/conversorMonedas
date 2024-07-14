package mx.com.felipe.conversormonedas.modelos;

import java.io.IOException;

public class MenuUsuario {

    private String monedasDisponibles = """
                USD --- Dólar Estadounidense
                ARS --- Peso Argentino
                BRL --- Real Brasileño
                COP --- Peso Colombiano
                EUR --- Euro
                MXN --- Peso Méxicano""";

    public void mostrarMenuPrincipal(){
        System.out.println("**********************************************************************************");
        System.out.println("********************* Bienvenido al portal de tipo de cambio *********************");
        System.out.println("**********************************************************************************");
    }

    public void mostrarMenuSecuandario() {
        System.out.println("A continuación digíte la opción que desea realizar: \n");
        String menuPrincipal = """
                1) Realizar una conversión
                2) Salir""";
        System.out.println(menuPrincipal);
    }

    public void mostrarMenuMonedas(){
        System.out.println("**********************************************************************************");
        System.out.println("*************************** Divisas Disponibles **********************************");
        System.out.println(monedasDisponibles);
        System.out.println("**********************************************************************************");
    }

    public void cantidadObtenida(String monedaBase, String monedaCambio, Double cantidadCambiar, Double resultado){
        System.out.println("\n**********************************************************************************");
        System.out.println(cantidadCambiar + " " + monedaBase + " equivalen a: " + resultado + " " + monedaCambio);
    }




}
