//Areas de todas las figuras
package tallerpolimorfismo;

public abstract class Figura {//Superclase abstracta Figura

    //Caracteristicas en comun de todas las figuras Geometricas
    private int dato1;
    private int dato2;
    private String name;

    //Constructor de Objeto que necesita solo 1 numero y nombre
    public Figura(int dato1, String name) {
        this.dato1 = dato1;
        this.name = name;
    }

    //Constructor de Objeto que necesita 2 numeros y nombre
    public Figura(int dato1, int dato2, String name) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.name = name;
    }

    //Metodos Get para obtener los datos de la Superclase desde las subclases
    public int getDato1() {return dato1;}
    public int getDato2() {return dato2;}
    public String getName() {return name;}

    //Metodos Set para settear un nuevo valor a las caracteristicas de la Superclase desde las subclases
    public void setDato1(int dato1) {this.dato1 = dato1;}
    public void setDato2(int dato2) {this.dato2 = dato2;}
    public void setName(String name) {this.name = name;}
    

    //Metodos abstractos vacios (implementados y modificados en cada subclase segun la necesidad)
    public abstract String printArea();
    public abstract void updateFigura();
}
