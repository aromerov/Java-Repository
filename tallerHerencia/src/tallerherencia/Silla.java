package tallerherencia;

import javax.swing.JOptionPane;

public class Silla extends Robot {

    private int peso;

    public Silla() {
        crearObjeto();
    }

    public Silla(int peso, int precio, String color, String material) {
        super(precio, color, material);
        this.peso = peso;
    }

    @Override//Metodo abstracto para imprimir
    public String print() {
        return "Detalles Silla:\nColor: " + super.getColor() + " | Material: " + super.getMaterial() + " | Precio: $" + super.getPrecio()
                + "\n" + "Peso que soporta: " + peso + "Kg";
    }

    @Override
    public void crearObjeto() {

        super.setColor(JOptionPane.showInputDialog("Ingrese el color de la Silla: "));
        super.setTamano(JOptionPane.showInputDialog("De que tamaño desea su Silla: "));
        super.setPrecio((int) (Math.random() * 300));//Precio Aleatorio
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en KG que desea que soporte su Silla: "));
    }
}
