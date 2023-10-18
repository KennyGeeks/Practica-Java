import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Calculadora de edad de un perro
        Scanner Teclado = new Scanner(System.in);
        Integer EdadPerro;
        Integer EdadTotalPerro;
        System.out.println("Ingrese la Edad de su Firulais");
        EdadPerro = Teclado.nextInt();
        EdadTotalPerro= EdadPerro * 7 ;
        System.out.println("Esta es la edad de tu Tapir :" + EdadTotalPerro);

    }
}
