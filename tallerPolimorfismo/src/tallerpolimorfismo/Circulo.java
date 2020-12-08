package tallerpolimorfismo;

import javax.swing.JOptionPane;

public class Circulo extends Figura {

    private final float pi = 3.1416f;
    private double formula;//Area Circulo = Pi * (r) elevado a 2 

    public Circulo(int dato1, String name) {
        super(dato1, name);
    }

    @Override
    public String printArea() {

        //Area del circulo
        formula = pi * super.getDato1();
        return "Area del " + super.getName() + ":\nFormula: " + pi + "*" + super.getDato1() + " = " + formula + "cm2";
    }

    @Override
    public void updateFigura() {

          JOptionPane.showMessageDialog(null, "Actualizacion de datos del Circulo");
        super.setName("Nombre de la nueva figura: ");
        super.setDato1((int) (Math.random() * 100));
        JOptionPane.showMessageDialog(null, "Se ha creado correctamente el Circulo");

    }

}
