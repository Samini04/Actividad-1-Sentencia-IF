import java.util.Scanner;
public class SentenciaIF_8 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar número al usuario
            System.out.print("Introduce un número entre 0 y 999: ");
            int numero = scanner.nextInt();

            // Comprobar cuántas cifras tiene el número
            if (numero < 10) {
                System.out.println("El número tiene 1 cifra.");
            } else if (numero < 100) {
                System.out.println("El número tiene 2 cifras.");
            } else if (numero < 1000) {
                System.out.println("El número tiene 3 cifras.");
            }
            scanner.close();
        }
    }

