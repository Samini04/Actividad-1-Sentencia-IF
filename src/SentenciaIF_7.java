import java.util.Scanner;  // Usamos Scanner para leer lo que el usuario meta

public class SentenciaIF_7 {
    public static void main(String[] args) {

        // Creamos el Scanner para pedir el precio
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del artículo: ");

        // Guardamos el precio que el usuario introduce
        double precio = sc.nextDouble();

        // Inicializamos la variable del impuesto
        double impuesto = 0;

        // Si el precio es 300 o más, le aplicamos el 5% de impuesto
        if (precio >= 300) {
            impuesto = precio * 0.05;
        }

        // Mostramos cuánto es el impuesto
        System.out.println("Impuesto: " + impuesto);

        // Mostramos el precio original (aunque aquí podrías sumar el impuesto si quisieras)
        System.out.println("Coste Total: " + precio);

        // Cerramos el Scanner porque ya no lo necesitamos
        sc.close();
    }
}
