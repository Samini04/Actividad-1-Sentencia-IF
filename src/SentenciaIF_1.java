public class SentenciaIF_1 {
    public static void main(String[] args) {

        // Se declaran dos variables enteras x e y
        int x = 3;
        int y = 8;

        // Evalúa si x es mayor que y y si x es menor que y al mismo tiempo  //false
        boolean nm1 = (x > y) && (x < y);
        System.out.println("El resultado de (x > y) && (x < y) es:" + nm1 );

        // Evalúa si x es mayor que y y si x no es menor que y  //false
        boolean nm2 = (x > y) && !(x < y);
        System.out.println("El resultado de (x > y) && !(x < y) es:" + nm2);

        // Niega el resultado de la evaluación anterior ((x > y) && (x < y)) //true
        boolean nm3 = !((x > y) && (x < y));
        System.out.println("El resultado de !((x > y) && (x < y)) es:" + nm3);

        // Evalúa si x es igual a y o si x es distinto de y //true
        boolean nm4 = (x == y) || (x != y);
        System.out.println("El resultado de (x == y) || (x != y) es:" + nm4);

        // Evalúa si x es igual a y o si no es cierto que x sea distinto de y //false
        boolean nm5 = (x == y) || !(x != y);
        System.out.println("El resultado de (x == y) || !(x != y) es:" + nm5 );

        // Niega la evaluación de si x es igual a y o si x es distinto de y //false
        boolean nm6 = !((x == y) || (x != y));
        System.out.println("El resultado de  !((x == y) || (x != y)) es:" +  nm6);

        // Evalúa si x es mayor o igual a y y si x es menor o igual a y //false
        boolean nm7 = (x >= y) && (x <= y);
        System.out.println("El resultado de  (x >= y) && (x <= y)  es:" + nm7);

        // Niega que x sea mayor o igual a y y evalúa si x es menor o igual a y //true
        boolean nm8 = !(x >= y) && (x <= y);
        System.out.println("El resultado de !(x >= y) && (x <= y) es " + nm8 );

        // Evalúa si x es mayor que y o si no es cierto que x sea igual a y //true
        boolean nm9 = (x > y) || !(x == y);
        System.out.println("El resultado de !(x >= y) && (x <= y) es " + nm9);
    }
}
