package ejercicio.pkg1;


/*Ejemplo: Programa que lea desde el teclado una calificación de un examen, 
 * que va desde la A hasta la F, y muestre el resultado obtenido.
 * Si el usuario lo escribe en minúscula el programa lo valida y acepta.
 * Se utiliza Switch.*/
import javax.swing.JOptionPane;

class CalificacionesValidaMinusculas { //Inicio de la clase

    public void ejercicio5() {
        //declaración de variables
        char nota; //variable que se le asigna un caracter que lee desde el teclado
        String notaIngresada; //variable que lee desde el teclado
        //Lee del teclado
        notaIngresada = JOptionPane.showInputDialog(null, "Introduzca una calificación (A - F), pulse enter: ", "Entrada de datos", JOptionPane.INFORMATION_MESSAGE);
        nota = notaIngresada.charAt(0); //Obtiene la primera letra ingresada por el usuario. Si en vez de escribir una letra escribe una frase solo toma la primera de ellas
        switch (nota) {//Inicio del switch (Cuando el valor condicional es un caracter se pone entre una comilla 'A'

            //Cuando más de una opción tiene el mismo resultado se ponen los case seguidos y en el último de ellos se escribe la instrucción a realizarse
            case 'a':
            case 'A':
                JOptionPane.showMessageDialog(null, "Excelente!! Examen superado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;//Instrucción para salir del switch

            case 'b':
            case 'B':
                JOptionPane.showMessageDialog(null, "Notable", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Notable.");
                break;

            case 'c':
            case 'C':
                JOptionPane.showMessageDialog(null, "Aprobado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'd':
            case 'D':
                JOptionPane.showMessageDialog(null, "Reprobado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'e':
            case 'E':
                JOptionPane.showMessageDialog(null, "Reprobado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            case 'f':
            case 'F':
                JOptionPane.showMessageDialog(null, "Suspendido", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;

            default://Por defecto: Se usa para cualquier otro dato ingresado que no sea uno de los anteriores
                JOptionPane.showMessageDialog(null, "La nota ingresada no es válida", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }//fin del switch

        JOptionPane.showMessageDialog(null, "Fin del programa", "Adios!!", JOptionPane.INFORMATION_MESSAGE);
    }//fin del método main
}//fin de la clase
