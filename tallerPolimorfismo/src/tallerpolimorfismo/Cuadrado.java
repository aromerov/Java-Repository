package tallerpolimorfismo;

import javax.swing.JOptionPane;

public class Cuadrado extends Figura {

    private double formula;//Area Cuadrado = Lado * Lado

    public Cuadrado(int dato1, int dato2, String name) {
        super(dato1, dato2, name);
    }

    @Override
    public String printArea() {

        //Area del circulo
        formula = super.getDato1() * super.getDato1();
        return "Area del " + super.getName() + ":\nFormula: " + super.getDato1() + "*" + super.getDato2() + " = " + formula + "cm2";
    }

    @Override
    public void updateFigura() {

        JOptionPane.showMessageDialog(null, "Actualizacion de datos del Circulo");
        super.setName("Nombre de la nueva figura");
        super.setDato1((int) (Math.random() * 100));
        super.setDato2((int) (Math.random() * 100));
        JOptionPane.showMessageDialog(null, "Se ha creado correctamente el Cuadrado");

    }

}
