import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDeDatos = new Scanner(System.in);
        System.out.println("Ingresa tu peso pe mascota ");
        double Peso = cargaDeDatos.nextDouble();
        System.out.println("Ingresa tu altura pe mmahuevo ");
        double Altura = cargaDeDatos.nextDouble();
        double IndiceMasaCorporal = Peso / (Altura * Altura);
        System.out.println("Tu Indice masa Corporal es: " + IndiceMasaCorporal);
        if (IndiceMasaCorporal >= 30.0) {
            System.out.println("Estas OBESO deja de tragar brother");
        }

        if (IndiceMasaCorporal >= 25.0 && IndiceMasaCorporal <= 30.0) {
            System.out.println("Estas con sobre peso oe gord@");
        }

        if (IndiceMasaCorporal >= 18.5 && IndiceMasaCorporal <= 25.0) {
            System.out.println("Estas normal sigue con los mostritos nmas bro");
        }

        if (IndiceMasaCorporal <= 18.6) {
            System.out.println("Estas flaco oe metele mas alitas mix");
        }

    }
}
