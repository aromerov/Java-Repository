package tallerpolimorfismo;

import java.util.ArrayList;

public class Admin {

    ArrayList<Figura> figuras;

    //Constructor vacio que ejecuta un metodo
    public Admin() {
        figuras = new ArrayList<>();
        createObject();
    }

    public void createObject() {

        //Creacion de objetos
        Figura circulo = new Circulo(2, "Circulo");
        Figura cuadrado = new Cuadrado(2, 2, "Cuadrado");
        Figura rectangulo = new Rectangulo(4, 5, "Rectangulo");
        Figura rombo = new Rombo(5, 3, "Rombo");
        Figura triangulo = new Triangulo(7, 16, "Triangulo");

        //Se agregan los objetos a la lista
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(rectangulo);
        figuras.add(rombo);
        figuras.add(triangulo);

    }

    //Metodo para Imprimir la lista
    public void printList() {

        //Bucle For-Each Loop para imprimir los objetos dentro de la lista
        for (Figura figura : figuras) {

            System.out.println(figura.printArea() + "\n");
        }

        System.out.println("--------------------------------------------------------");
        
        for (Figura figura : figuras) {

            if (figura instanceof Figura) {
                figura.updateFigura();
            } else {
                System.out.println("Objeto no existe");
            }
            System.out.println(figura.printArea() + "\n");
        }
    }
}
