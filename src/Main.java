import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    double numero1, numero2, suma, resta, multi;

        System.out.println("Ingrese el primer valor");
        numero1= teclado.nextDouble();

        System.out.println("Ingrese el primer valor");
        numero2= teclado.nextDouble();

        suma = numero1+numero2;
        resta = numero1-numero2;
        multi= numero1*numero2;

        System.out.println("La suma es "+suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicacion es: "+multi);

    }
}