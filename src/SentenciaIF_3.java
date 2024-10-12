import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class SentenciaIF_3 {
    public static void main(String [] args) {

        // Crear un objeto Scanner para leer datos ingresados por el usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese el primer número: ");

        // Leer el número ingresado por el usuario y guardarlo en la variable 'numero'
        int numero = sc.nextInt();

        // Comprobar si el número es par (el residuo al dividir por 2 es 0)
        if (numero % 2 == 0) {
            // Si es par, mostrar mensaje correspondiente
            System.out.println("El número es par");
        } else {
            // Si no es par, mostrar mensaje correspondiente
            System.out.println("El número es impar");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }
}

