//Clase Sillon que hereda de la superclase Robot
package tallerherencia;

import javax.swing.JOptionPane;

public class Sillon extends Robot {

    //Caracteristicas
    private String tela;
    private String descripcion;

    public Sillon() {
        crearObjeto();
    }

    //Construimos al Objeto Sillon
    public Sillon(String tela, String descripcion, int precio, String color, String tamano) {
        super(precio, color, tamano);
        this.tela = tela;
        this.descripcion = descripcion;
    }

    @Override//Metodo abstracto para imprimir datos
    public String print() {
        return "Detalles Sillon:\nTela: " + tela + " | Color: " + super.getColor() + " | Precio: $" + super.getPrecio() 
                + "\n" + "Tamaño: " + super.getTamano() + " | Descripcion: " + descripcion;

    }

    @Override
    public void crearObjeto() {

        super.setColor(JOptionPane.showInputDialog("Ingrese el color de su Sillon: "));
        super.setTamano(JOptionPane.showInputDialog("De que tamaño desea su Sillon: "));
        super.setPrecio((int) (Math.random() * 300));//Precio Aleatorio
        tela = JOptionPane.showInputDialog("Ingrese la tela que desea para el sillon: ");
        descripcion = JOptionPane.showInputDialog("Ingrese algun otro detalle que desee: ");

    }
}
