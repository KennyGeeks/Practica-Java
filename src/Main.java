import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


    }
}

/* TAREA 7 PEDIR AL USUARIO QUE INGRESE SU PAIS E IMPRIMIR EL PAIS QUE INGRESO CON LINK DE GOOGLE
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Su Pais : ");
        String Pais = teclado.nextLine();
        System.out.println("https://www.google.com/search?q=" + Pais);

         */

/* TAREA 6 CALCULAR NUMEROS PARES E IMPARES

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su Primer Valor: ");
        Integer Numero1 = teclado.nextInt();
        Integer resto = Numero1 % 2;
        if (resto == 0 ) {
            System.out.println("Es Numero Par ");
        } else {
            System.out.println("Es Numero IMPAR");
        }
        */

/*      TAREA 5 DIGITAR 3 VALORES E INDICAR CUAL ES EL MAYOR DE LOS 3

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su Primer Valor: ");
        Integer numero1 = teclado.nextInt();
        System.out.println("Ingrese su Segundo Valor: ");
        Integer numero2 = teclado.nextInt();
        System.out.println("Ingrese su Tercer Valor: ");
        Integer numero3 = teclado.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(" El Valor mayor es: " + numero1);
        }
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(" El Valor mayor es: " + numero2);
        }
        if (numero3 > numero2 && numero3 > numero1) {
            System.out.println(" El Valor mayor es: " + numero3);
        }
        */

/*  TAREA 4 ADIVINAR UN NUMERO ALEATORIO

    Scanner teclado = new Scanner(System.in);
    Integer NumeroUsuario = 0;
    Integer NumeroAleatorio = (int) Math.floor(Math.random() * 100);
    System.out.println(" Cual es tu numero aleatorio");
    NumeroUsuario = teclado.nextInt();
if (NumeroUsuario == NumeroAleatorio) {
    System.out.println("Adivinaste el numero !! ");
} else {
    System.out.println("Numero Equivocado ");
}
    }
    */

/*  TAREA 3 : CALCULADORA DE PRECIOS CON DESCUENTO APLICADO

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
    */

/* TAREA2: Calculadora de Millas A Kilometros

        Scanner Teclado = new Scanner(System.in);
        double Millas;
        double Kilometros;
        System.out.println("Ingresar Millas");
        Millas = Teclado.nextDouble();
        Kilometros = Millas *1.60934;
        System.out.println("Este es tu kilometraje de tus millas:" + Kilometros);
    }
    */

/* TAREA1: Calculadora de edad de un perro

        Scanner Teclado = new Scanner(System.in);
        Integer EdadPerro;
        Integer EdadTotalPerro;
        System.out.println("Ingrese la Edad de su Firulais");
        EdadPerro = Teclado.nextInt();
        EdadTotalPerro= EdadPerro * 7 ;
        System.out.println("Esta es la edad de tu Tapir :" + EdadTotalPerro);

    }
    */