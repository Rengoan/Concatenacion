/*
 * 
 * Ejemplo concatenacion
 * 
 */
package concatenacion;

/**
 *
 * @author Alumno Mañana
 */
public class Concatenacion {

    public static void main(String[] args) {
        var alumno = "Pedro";
        var titulo = "Mecanico";

        var concat = titulo + " " + alumno;
        System.out.println("concat = " + concat);

//        Con variables enteras
        var valor1 = 1;
        var valor2 = 2;
        System.out.println(valor1 + valor2);
        System.out.println(valor1 + valor2 + alumno);
        System.out.println(alumno + valor1 + valor2);
        System.out.println(alumno + (valor1 + valor2));

    }

}
