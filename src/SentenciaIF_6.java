import java.util.Scanner;  // Necesitamos Scanner para leer lo que el usuario mete

public class SentenciaIF_6 {
    public static void main(String[] args) {

        // Creamos el Scanner para obtener la entrada del usuario
        Scanner scan = new Scanner(System.in);

        // Declaramos la variable para la edad
        int age = 0;

        // Pedimos que introduzca su edad
        System.out.println("Introduce tu edad:");

        // Guardamos la edad que el usuario escribió
        age = scan.nextInt();

        // Verificamos si es menor o igual a 13
        if (age <= 13) {
            // Si tiene 13 o menos, le damos tarifa de niño
            System.out.println("Se le aplicará la tarifa de niño.");
        } else {
            // Si es mayor, le damos tarifa de adulto
            System.out.println("Se le aplicará la tarifa de adulto.");
        }

        // Esto es lo que verá al final
        System.out.println("Disfruta la película.");
    }
}



