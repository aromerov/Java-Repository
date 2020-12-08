package tallerherencia;

public abstract class Robot {

    //Caracteristicas en comun
    private int precio;//todos
    private String tamano;//pequeno, mediano o grande
    private String color;//todos
    private String material;//Escritorio, silla, comedor

    //Constructor vacio para crear un nuevo Objeto
    public Robot() {
    }

    //Constructor para los Objetos de las subclases que necesiten Heredar solamente precio y color
    public Robot(int precio, String color) {
        this.precio = precio;
        this.color = color;
    }

    //Constructor para los Objetos de las subclases que necesiten Heredar solamente precio, color y tamano
    public Robot(int precio, String color, String tamano) {
        this.precio = precio;
        this.tamano = tamano;
        this.color = color;
    }

    //Constructor para los Objetos de las subclases que necesiten Heredar solamente precio, color y material
    public Robot(String color, int precio, String material) {
        this.precio = precio;
        this.color = color;
        this.material = material;
    }

    //Constructor para los Objetos de las subclases que necesiten Heredar solamente precio y color
    public Robot(int precio, String color, String tamano, String material) {
        this.precio = precio;
        this.tamano = tamano;
        this.color = color;
        this.material = material;
    }

    //Metodos Get
    public int getPrecio() {
        return precio;
    }

    public String getTamano() {
        return tamano;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    //Metodos Set
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //Metodo abstracto para imprimir los datos
    public abstract String print();

    public abstract void crearObjeto();

}
