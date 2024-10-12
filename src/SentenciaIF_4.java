public class SentenciaIF_4 {
    public static void main(String[] args) {

        // Declaramos la variable 'nota' y le asignamos el valor 5.
        int nota = 5;

        // Operador ternario: si 'nota' es mayor o igual a 5, asigna "Aprobado" a 'notaFinal', de lo contrario, "Suspendido".
        String notaFinal = (nota >= 5) ? "Aprobado" : "Suspendido";

        // Imprime el resultado de 'notaFinal' en la consola.
        System.out.println(notaFinal);
    }
}