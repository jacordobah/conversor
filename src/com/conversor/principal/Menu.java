package com.conversor.principal;

import com.conversor.calculos.Conversor;
import com.conversor.modelos.ConsultarDivisa;
import com.conversor.modelos.MonedaOMDB;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String divisaBase = "";
        String divisaSalida = "";
        while(true){
            System.out.println("------------------------------------------------------------------------------\n\n");
            System.out.println("Bienvenido al conversor de monedas. \n");
            System.out.println("Por Favor seleccione la opcion de conversión que desea utilizar");
            System.out.println("""
                    1. Dólar a Peso colombiano (COP)
                    2. Dólar a Peso chileno (CLP)
                    3. Dólar a Peso argentino (ARS)
                    4. Peso colombiano a Dólar (USD)
                    5. Peso colombiano a Peso chileno (CLP)
                    6. Peso colombiano a Peso argentino (ARS)
                    7. Peso chileno a Dolar (usd)
                    8. Peso chileno a Peso colombiano (COP)
                    9. Peso chileno a Peso argentino (ARS)
                    10. Peso argentino a Dólar(USD)
                    11. Peso argentino a Peso colombiano (COP)
                    12. peso argentino a Peso chileno (CLP)
                    13. salir\n\n""");
            System.out.println("Digite la opción:");
            try {
                int opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        divisaBase = "USD";
                        divisaSalida = "COP";
                        break;
                    case 2:
                        divisaBase = "USD";
                        divisaSalida = "CLP";
                        break;
                    case 3:
                        divisaBase = "USD";
                        divisaSalida = "ARS";
                        break;
                    case 4:
                        divisaBase = "COP";
                        divisaSalida = "USD";
                        break;
                    case 5:
                        divisaBase = "COP";
                        divisaSalida = "CLP";
                        break;
                    case 6:
                        divisaBase = "COP";
                        divisaSalida = "ARS";
                        break;
                    case 7:
                        divisaBase = "CLP";
                        divisaSalida = "USD";
                        break;
                    case 8:
                        divisaBase = "CLP";
                        divisaSalida = "COP";
                        break;
                    case 9:
                        divisaBase = "CLP";
                        divisaSalida = "ARS";
                        break;
                    case 10:
                        divisaBase = "ARS";
                        divisaSalida = "USD";
                        break;
                    case 11:
                        divisaBase = "ARS";
                        divisaSalida = "COP";
                        break;
                    case 12:
                        divisaBase = "ARS";
                        divisaSalida = "CLP";
                        break;
                    case 13:
                        System.out.println("Gracias por usar nuestro conversor");
                        return;
                    default:
                        System.out.println("Opción inválida\n");
                        break;
                }
                System.out.println("Digite el monto a convertir: ");
                double valor = lectura.nextDouble();


                Conversor conversor = new Conversor(divisaSalida,divisaBase,valor);
                double resultado = conversor.convirtiendo();
                System.out.println("Valor en " + divisaSalida + ":  " + resultado);

            }catch (NumberFormatException e){
                System.out.println("No es posible realizarla operación, revise los datos ingresados.");
            }
        }
    }
}