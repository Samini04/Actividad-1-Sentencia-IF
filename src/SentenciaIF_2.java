import java.util.Scanner;  // Importamos la clase Scanner para leer la entrada del usuario

public class SentenciaIF_2 {

    public static void main(String[] args) {

        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.println("Ingrese un número:");

        // Leer el número entero introducido por el usuario
        int numero = sc.nextInt();

        // Verificar si el número es positivo o negativo
        if (numero >= 0) {
            // Si el número es mayor o igual a 0, es positivo
            System.out.println("El número " + numero + " es positivo");
        } else {
            // Si el número es menor que 0, es negativo
            System.out.println("El número " + numero + " es negativo");
        }

        // Cerrar el objeto Scanner para evitar pérdida de recursos
        sc.close();
    }
}



