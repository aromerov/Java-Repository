package tallerherencia;

import javax.swing.JOptionPane;

public class Escritorio extends Robot {

    //Caracteristicas unicas
    private int peso;//Variable para saber cuanto peso soporta 

    public Escritorio() {
        crearObjeto();
    }

    public Escritorio(int peso, int precio, String color, String tamano, String material) {
        super(precio, color, tamano, material);
        this.peso = peso;
    }

    @Override//Metodo abstracto para imprimir
    public String print() {
        return "Detalles Escritorio:\nColor: " + super.getColor() + " | Material: " + super.getMaterial() + "\n"
                + "Peso que soporta: " + peso + "Kg | Precio: $" + super.getPrecio() + " | Tamaño: " + super.getTamano();
    }

    @Override
    public void crearObjeto() {

        super.setColor(JOptionPane.showInputDialog("Ingrese el color de su Escritorio: "));
        super.setTamano(JOptionPane.showInputDialog("De que tamaño desea su Escritorio: "));
        super.setMaterial(JOptionPane.showInputDialog("Ingrese el material que desea para su Escritorio: "));
        super.setPrecio((int) (Math.random() * 300));//Precio Aleatorio
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en KG que desea que soporte su Escritorio: "));
    }
}
