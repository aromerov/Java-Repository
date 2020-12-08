package tallerherencia;

import javax.swing.JOptionPane;

public class MesaComedor extends Robot {

    private int numSillas;

    public MesaComedor() {
        crearObjeto();
    }

    public MesaComedor(int numSillas, int precio, String color, String material) {
        super(precio, color, material);
        this.numSillas = numSillas;
    }

    @Override//Metodo abstracto para imprimir
    public String print() {
        return "Detalles Mesa de Comedor:\nColor: " + super.getColor() + " | Material: " + super.getMaterial()
                + "\n" + "Precio: $" + super.getPrecio() + " | Numero de Sillas: " + numSillas;
    }

    @Override
    public void crearObjeto() {

        super.setColor(JOptionPane.showInputDialog("Ingrese el color de la Mesa: "));
        super.setMaterial(JOptionPane.showInputDialog("Ingrese el material que desea para su Mesa: "));
        super.setPrecio((int) (Math.random() * 300));//Precio Aleatorio
        numSillas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese para cuantas sillas desea su Mesa: "));
    }
}
