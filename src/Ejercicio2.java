import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //inicializamos el scanner

        System.out.print("Ingresar numero 1: ");
        var numero1 = scanner.nextInt();

        System.out.print("Ingresar numero 2: ");
        var numero2 = scanner.nextInt();

        System.out.print("Ingresar numero 3: ");
        var numero3 = scanner.nextInt();

        System.out.print("Ingresar numero 4: ");
        var numero4 = scanner.nextInt();

        System.out.print("Ingresar numero 5: ");
        var numero5 = scanner.nextInt();

        System.out.print("Ingresar numero 6: ");
        var numero6 = scanner.nextInt();

        scanner.close(); //cerrando el scanner

        var concatenacion = String.valueOf(numero1) +
                String.valueOf(numero2) +
                String.valueOf(numero3) +
                String.valueOf(numero4) +
                String.valueOf(numero5) +
                String.valueOf(numero6);
        System.out.println("El resultado es: " + concatenacion);
    }
}
