
/* Programa que calcula la cantidad de horas que se debe dormir según la edad 
 * de una persona: las personas menores de 12 a�os deben dormir entre 9 y 11 horas,
 * las que tienen entre 12 y 64 anios inclusive deben dormir entre 7 y 9 horas 
 * y las mayores de 64 a�os deben dormir de 7 a 8 horas diariamente.
 * El programa se ejecuta una vez y luego pregunta si se desea usar nuevamente, para eso se usa el DO WHILE*/
package ejercicio.pkg1;

import javax.swing.JOptionPane;

public class HoraDeSuenio {

    public HoraDeSuenio() {
    }
    
    public void ejercicio2() {
        // Declaracion de variables
        String nombre;//Nombre del usuario
        String textoLeido; //Variable que se usa para todos los datos que se leen desde el teclado
        int edad; //Edad del usuario
        String mensaje = "";//Mensaje al usuario con la cantidad de horas que debe dormir seg�n su edad, se inicializa la variable en blanco
        String continuar;//Variable para saber si el usuario desea seguir ejecutando el programa

        JOptionPane.showMessageDialog(null, "Hola! \nTe voy a decir cu�ntas horas debes dormir seg�n tu edad :) ", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);

        //ciclo DO-WHILE se utiliza cuando queremos que las instrucciones que ejecuten al menos una vez y luego preguntar si se desea ejecutar de nuevo
        do {
            // Ingreso de valores
            textoLeido = JOptionPane.showInputDialog(null, "Digite su nombre", "Entrada de datos", JOptionPane.INFORMATION_MESSAGE);
            nombre = textoLeido;
            textoLeido = JOptionPane.showInputDialog(null, "Digite su edad", "Entrada de datos", JOptionPane.INFORMATION_MESSAGE);
            edad = Integer.parseInt(textoLeido);
            //Condiciones
            if (edad >= 0 && edad < 12) {
                mensaje = nombre + ": \nDebes dormir entre 9 y 11 horas al d�a";
                //Salida al usuario
                JOptionPane.showMessageDialog(null, mensaje, "Horas de sue�o seg�n tu edad", JOptionPane.INFORMATION_MESSAGE);

            }//fin del if
            else {
                if (edad >= 12 && edad <= 64) {
                    mensaje = nombre + ": \nDebes dormir entre 7 y 9 horas al d�a";
                    //Salida al usuario
                    JOptionPane.showMessageDialog(null, mensaje, "Horas de sue�o seg�n tu edad", JOptionPane.INFORMATION_MESSAGE);
                }//fin del if
                else {
                    if (edad > 64) {
                        mensaje = nombre + ": \nDebes dormir entre 7 y 8 horas al d�a";
                        //Salida al usuario
                        JOptionPane.showMessageDialog(null, mensaje, "Horas de sue�o seg�n tu edad", JOptionPane.INFORMATION_MESSAGE);
                    }//fin del if
                    else {
                        JOptionPane.showMessageDialog(null, nombre + " su edad no es v�lida!", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }//fin del else
                }//fin del else
            }//fin del else

            //Pregunta si desea continuar
            continuar = JOptionPane.showInputDialog(null, "Quiere probar de nuevo?? Escriba SI o NO", "Pregunta", JOptionPane.INFORMATION_MESSAGE);
        } while (continuar.equals("SI") || continuar.equals("si") || continuar.equals("s�") || continuar.equals("S�")); //La condici�n del While se pone al final, en este caso son 4 condiciones en una sola separadas por el signo de O.  

    }//Fin metodos main
}//Fin de Clase

