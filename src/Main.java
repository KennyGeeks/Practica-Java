import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Un Programa que el usuario ingrese 5 numeros y mostrarlos
        int [] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        for (int contador = 0; contador < numeros.length; contador ++) {
            System.out.println("Ingrese un numero");
            numeros[contador] = teclado.nextInt();
        }
        {
            System.out.println("Los Numeros que ingreso son: ");
            for (int contador = 0; contador < numeros.length; contador++)
                System.out.println(numeros[contador]);
        }
    }
    }