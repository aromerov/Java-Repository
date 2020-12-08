package ejercicio.pkg1;

/*Ejemplo: Programa que lea desde el teclado una calificaci�n de un examen, 
 * que va desde la A hasta la F, y muestre el resultado obtenido. 
 * Se utiliza Switch.*/
import javax.swing.JOptionPane;

public class Calificaciones { //Inicio de la clase

    public void ejercicio3(){ //Inicio del metodo
        //declaraci�n de variables
        char nota; //variable que se le asigna un caracter que lee desde el teclado
        String notaIngresada; //variable que lee desde el teclado
        //Lee del teclado
        notaIngresada = JOptionPane.showInputDialog(null, "Introduzca una calificaci�n (A - F), pulse enter: ", "Entrada de datos", JOptionPane.INFORMATION_MESSAGE);
        nota = notaIngresada.charAt(0); //Obtiene la primera letra ingresada por el usuario. Si en vez de escribir una letra escribe una frase solo toma la primera de ellas
        switch (nota) {//Inicio del switch (Cuando el valor condicional es un caracter se pone entre una comilla 'A'
            case 'A':
                JOptionPane.showMessageDialog(null, "Excelente!! Examen superado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;//Instrucci�n para salir del switch
            case 'B':
                JOptionPane.showMessageDialog(null, "Notable", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Notable.");
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "Aprobado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "Reprobado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'E':
                JOptionPane.showMessageDialog(null, "Reprobado", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 'F':
                JOptionPane.showMessageDialog(null, "Suspendido", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                break;
            default://Por defecto: Se usa para cualquier otro dato ingresado que no sea uno de los anteriores
                JOptionPane.showMessageDialog(null, "La nota ingresada no es v�lida", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }//fin del switch

        JOptionPane.showMessageDialog(null, "Fin del programa", "Adios!!", JOptionPane.INFORMATION_MESSAGE);
    }//fin del m�todo main
}//fin de la clase
