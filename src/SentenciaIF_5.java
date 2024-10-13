import java.util.Scanner;  // Importa la clase Scanner para leer entradas del usuario

public class SentenciaIF_5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir entrada desde el teclado
        Scanner sc = new Scanner(System.in);

        // Imprimir el mensaje solicitando al usuario que indique si es propietario
        System.out.println("¿Eres el propietario de la máquina? (Introduce \"s\" o \"n\") ");

        // Declarar la variable para almacenar la respuesta del usuario
        String respuesta;

        // Leer la entrada del usuario (línea completa) y almacenarla en la variable 'respuesta'
        respuesta = sc.nextLine();

        // Comprobar si la respuesta es 's' (no distingue mayúsculas/minúsculas)
        if (respuesta.equalsIgnoreCase("s")) {
            // Si es 's', imprime mensaje de bienvenida
            System.out.println("Hola, bienvenido al sistema");
        }
        else {
            // Si no es 's', imprime acceso denegado
            System.out.println("Acceso denegado");
        }

        // Cerrar el objeto Scanner para liberar recursos
        sc.close();
    }
}

