import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        Integer Precio;
        Integer Porcentaje;
        Integer Descuento;
        System.out.println("Ingresa tu Precio sin descuento");
        System.out.println("Ingresa tu Porcentaje de descuento pex ");
        Descuento = (Precio * Porcentaje) / 100 ;
        System.out.println("Este Seria tu precio con Descuento pe Misio: " + Descuento);
    }
    }


        /* TAREA2: Calculadora de Millas A Kilometros
        Scanner Teclado = new Scanner(System.in);
        double Millas;
        double Kilometros;
        System.out.println("Ingresa las Millas pe JalaBolas");
        Millas = Teclado.nextDouble();
        Kilometros = Millas *1.60934;
        System.out.println("Este es tu kilometraje de tus millas pe mascota :" + Kilometros);

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

