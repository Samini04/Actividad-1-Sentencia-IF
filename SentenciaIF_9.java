import java.util.Random;
import java.util.Scanner;

public class SentenciaIF_9 {
        public static void main(String[] args) {
            // Generar número aleatorio entre 0 y 10
            Random rand = new Random();
            int numeroAleatorio = rand.nextInt(11);  // Genera un número entre 0 y 10 (incluye 0 y 10)

            // Solicitar número al usuario
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número entre 0 y 10: ");
            int numeroUsuario = scanner.nextInt();

            // Comparar el número del usuario con el número aleatorio
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Tu número es menor.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Tu número es mayor.");
            } else {
                System.out.println("¡¡¡¡Premio!!!!");
            }

            scanner.close();
        }
    }

