package ejercicio.pkg1;

/*Ejemplo: Programa que lea desde el teclado dos valores num�ricos y le da al 
 * usuario la opci�n de elegir si desea sumarlos, restarlos, multiplicarlos o dividirlos
 * y muestra el resultado obtenido.
 * Se utiliza Switch.*/
import javax.swing.JOptionPane;

public class OperacionesMatematicas { //Inicio de la clase

    public void ejercicio4() {//Inicio del m�todo Main

        //declaraci�n de variables
        String entrada; //variable a la que se le asigna cada valor que lee desde el teclado
        int numero1, numero2, opcion;
        int resultado = 0; //Se crea la variable y se inicializa con el valor de cero para evitar errores en caso de no recibir un valor durante la ejecuci�n del programa
        //Lee del teclado
        entrada = JOptionPane.showInputDialog(null, "Introduzca el primer n�mero", "Operaciones matem�ticas", JOptionPane.INFORMATION_MESSAGE);
        numero1 = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null, "Introduzca el segundo n�mero", "Operaciones matem�ticas", JOptionPane.INFORMATION_MESSAGE);//se usa la misma variable al leer desde el tecladopara no crear m�s
        numero2 = Integer.parseInt(entrada);
        entrada = JOptionPane.showInputDialog(null, "Elija una opci�n \n 1-Sumar\n 2-Restar \n 3-Multiplicar \n 4-Dividir\n 5-Salir", "Operaciones matem�ticas", JOptionPane.INFORMATION_MESSAGE);//se usa la misma variable al leer desde el tecladopara no crear m�s
        opcion = Integer.parseInt(entrada);
        switch (opcion) {//Inicio del switch (Cuando el valor condicional es un n�mero no se pone entre comillas

            case 1://suma
                resultado = numero1 + numero2;
                break;//Instrucci�n para salir del switch

            case 2://resta
                resultado = numero1 - numero2;
                break;//Instrucci�n para salir del switch

            case 3://Multiplicaci�n
                resultado = numero1 * numero2;
                break;//Instrucci�n para salir del switch

            case 4://Divisi�n
                resultado = numero1 / numero2;
                break;//Instrucci�n para salir del switch

            case 5://Salir
                JOptionPane.showMessageDialog(null, "Adios!!", "Fin del programa", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);//Instrucci�n para terminar el programa de manera abrupta

            default://Por defecto: Se usa para cualquier otro dato ingresado que no sea uno de los anteriores
                JOptionPane.showMessageDialog(null, "La opci�n no es v�lida", "Error", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);//Instrucci�n para terminar el programa de manera abrupta

        }//fin del switch

        JOptionPane.showMessageDialog(null, "El resultado de la operaci�n es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }//fin del m�todo main
}//fin de la clase
