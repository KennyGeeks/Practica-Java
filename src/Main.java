import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        Integer PrecioRegular;
        Integer Porcentaje;
        Integer PrecioTotal;
        System.out.println("Ingresa tu Precio Regular");
        PrecioRegular = Teclado.nextInt();
        System.out.println("Ingresa tu Porcentaje de Descuento ");
        Porcentaje = Teclado.nextInt();
        PrecioTotal = PrecioRegular - (PrecioRegular * Porcentaje) / 100;
        System.out.println("Precio Total con Descuento Aplicado: " + PrecioTotal);
    }
    }


        /* TAREA2: Calculadora de Millas A Kilometros
        Scanner Teclado = new Scanner(System.in);
        double Millas;
        double Kilometros;
        System.out.println("Ingresar Millas");
        Millas = Teclado.nextDouble();
        Kilometros = Millas *1.60934;
        System.out.println("Este es tu kilometraje de tus millas:" + Kilometros);

    } */


        /* TAREA1: Calculadora de edad de un perro
        Scanner Teclado = new Scanner(System.in);
        Integer EdadPerro;
        Integer EdadTotalPerro;
        System.out.println("Ingrese la Edad de su Firulais");
        EdadPerro = Teclado.nextInt();
        EdadTotalPerro= EdadPerro * 7 ;
        System.out.println("Esta es la edad de tu Tapir :" + EdadTotalPerro);

    } */

