package ejercicio.pkg1;

import javax.swing.JOptionPane;

public class DiaLaboral {

    public DiaLaboral() {
    }
           
    public void ejercicio(){
        String diaT = JOptionPane.showInputDialog(null, "Ingrese el numero de un dia de la semana", "Solicitud del dia", JOptionPane.INFORMATION_MESSAGE);
        int dia = Integer.parseInt(diaT);

        if (dia < 1 || dia > 7) {
            JOptionPane.showMessageDialog(null, "El numero ingresado no corresponde a ningún día de la semana", "Dia no valido", JOptionPane.INFORMATION_MESSAGE);
        }//fin if

        if (dia == 1) {
            JOptionPane.showMessageDialog(null, "El dia lunes corresponde a un día laboral", "Dia laboral", JOptionPane.INFORMATION_MESSAGE);
        }//fin if 1
        else {
            if (dia == 2) {
                JOptionPane.showMessageDialog(null, "El dia martes corresponde a un día laboral", "Dia laboral", JOptionPane.INFORMATION_MESSAGE);
            }//fin if 2
            else {
                if (dia == 3) {
                    JOptionPane.showMessageDialog(null, "El dia miercoles corresponde a un día laboral", "Dia laboral", JOptionPane.INFORMATION_MESSAGE);
                }//fin if 3
                else {
                    if (dia == 4) {
                        JOptionPane.showMessageDialog(null, "El dia jueves corresponde a un día laboral", "Dia laboral", JOptionPane.INFORMATION_MESSAGE);
                    }//fin if 4
                    else {
                        if (dia == 5) {
                            JOptionPane.showMessageDialog(null, "El dia viernes corresponde a un día laboral", "Dia laboral", JOptionPane.INFORMATION_MESSAGE);
                        }//fin if 5
                    }//fin else
                }//fin else
            }
        }

        if (dia == 6) {
            JOptionPane.showMessageDialog(null, "El dia sabado NO corresponde a un día laboral", "Dia NO laboral", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (dia == 7) {
                JOptionPane.showMessageDialog(null, "El dia domingo NO corresponde a un día laboral", "Dia NO laboral", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}//fin clase

