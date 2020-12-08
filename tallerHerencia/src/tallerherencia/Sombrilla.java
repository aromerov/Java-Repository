package tallerherencia;

import javax.swing.JOptionPane;

public class Sombrilla extends Robot {

    //Caracteristicas unicas
    private int numBarras;

    public Sombrilla() {
        crearObjeto();
    }

    //Construimos al Objeto Sillon
    public Sombrilla(int numBarras, int precio, String color, String tamano) {
        super(precio, color, tamano);
        this.numBarras = numBarras;
    }

    @Override//Metodo abstracto para imprimir
    public String print() {
        return "Detalles Sombrilla:\nColor: " + super.getColor() + " | Numero de Barras: " + numBarras + " | Precio: $" + super.getPrecio() + "\n"
                + "Tamaño: " + super.getTamano();
    }

    @Override
    public void crearObjeto() {

        super.setColor(JOptionPane.showInputDialog("Ingrese el color de la Sombrilla: "));
        super.setTamano(JOptionPane.showInputDialog("De que tamaño desea su Sombrilla: "));
        super.setPrecio((int) (Math.random() * 300));//Precio Aleatorio
        numBarras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de barras para su sombrilla: "));

    }

}
