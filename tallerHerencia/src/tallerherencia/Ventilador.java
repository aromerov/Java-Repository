package tallerherencia;

import javax.swing.JOptionPane;

public class Ventilador extends Robot {

    //Caracteristicas unicas
    private int velocidad;//Se conce cuantas velocidades tiene(baja,media,rapida)

    public Ventilador() {
        crearObjeto();
    }

    public Ventilador(int velocidad, int precio, String color, String tamano) {
        super(precio, color, tamano);
        this.velocidad = velocidad;
    }

    @Override//Metodo abstracto para imprimir
    public String print() {
        return "Detalles Ventilador:\nColor: " + super.getColor() + " | Tamaño: " + super.getTamano() + " | Precio: $"
                + super.getPrecio() + "\n" + " Ademas el ventilador posee " + velocidad + " velocidad(es)";
    }

    @Override
    public void crearObjeto() {

        super.setColor(JOptionPane.showInputDialog("Ingrese el color del Ventilador: "));
        super.setTamano(JOptionPane.showInputDialog("De que tamaño desea su Ventilador: "));
        super.setPrecio((int) (Math.random() * 300));//Precio Aleatorio
        velocidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantas velocidades necesita para su Ventilador: "));
    }
}
