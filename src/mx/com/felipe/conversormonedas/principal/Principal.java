package mx.com.felipe.conversormonedas.principal;

import mx.com.felipe.conversormonedas.modelos.*;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        MenuUsuario menuUsuario =  new MenuUsuario();
        menuUsuario.mostrarMenuPrincipal();
        ValidadorMoneda validadorMoneda = new ValidadorMoneda();

        Scanner sc =  new Scanner(System.in);
        int opcion;
        String monedaOrigen;
        String monedaCambio;
        Double cantidad;

        try {

            while (true) {

                menuUsuario.mostrarMenuSecuandario();
                opcion = sc.nextInt();

                if (opcion == 1) {

                    menuUsuario.mostrarMenuMonedas();

                    System.out.println("Ingrese la moneda origen: ");
                    monedaOrigen =  sc.next().toUpperCase();
                    if (!validadorMoneda.esMonedaValida(monedaOrigen)) {
                        System.out.println("Divisa no valida!");
                        break;
                    }

                    System.out.println("Ingrese la moneda cambio: ");
                    monedaCambio =  sc.next().toUpperCase();

                    if (!validadorMoneda.esMonedaValida(monedaCambio)) {
                        System.out.println("Divisa no valida!");
                        break;
                    }

                    System.out.println("Ingrese la cantidad a convertir: ");
                    cantidad = sc.nextDouble();


                    BusquedaTipoCambio busquedaTipoCambio = new BusquedaTipoCambio(monedaOrigen, monedaCambio, cantidad);
                    Moneda moneda = new Moneda(busquedaTipoCambio.monedaCambio());
                    menuUsuario.cantidadObtenida(monedaOrigen, monedaCambio, cantidad, moneda.getResultado());

                } else if (opcion == 2) {
                    System.out.println("¡Esperamos verte pronto!");
                    break;
                }

                else {
                    System.out.println("Opción incorrecta intente nuevamente ...");
                }


            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }









    }
}
