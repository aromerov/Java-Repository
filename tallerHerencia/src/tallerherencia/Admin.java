package tallerherencia;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Admin {

    private int suma;
    public int contador = 0;
    public LinkedList<Robot> robotList;//Lista de Objetos por defecto
    public LinkedList<Robot> carrito = new LinkedList<>();//Carrito de compra 

    public Admin() {
        robotList = new LinkedList<>();
        crearObjetos();
    }

    public void crearObjetos() {

        //Diferentes tipos de Objetos Robot
        robotList.add(new Sillon("Cuero", "Estado 10/10", 200, "Negro", "Mediano"));
        robotList.add(new Sombrilla(15, 20, "Estampado", "Grande"));
        robotList.add(new Escritorio(50, 200, "Cafe", "Grande", "Madera"));
        robotList.add(new Silla(80, 80, "Rojo", "Metal"));
        robotList.add(new Ventilador(3, 85, "Blanco", "Mediano"));
        robotList.add(new MesaComedor(4, 180, "Gris", "Vidrio"));
    }

    //----------------------------------------------------------------------------
    public void menu() {

        int opcion;

        do {//Empieza el Menu

            opcion = Integer.parseInt(JOptionPane.showInputDialog("||||MENU FABRICA ROBX||||\n"
                    + "1. Ver o Comprar Productos Pre-Fabricados\n2. Fabricar producto nuevo\n3. Ver Carrito\n0. Salir "));

            switch (opcion) {//Opciones principales del menu

                //Empieza opcion 1 del menu principal----------------------------------------------------------------------------
                case 1://En caso de que esocja la opcion 1 del menu --- se ejecuta el For-Each Loop

                    int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1. Ver Productos Pre-Fabricados\n "
                            + "2. Comprar Producto Pre-Fabricado\n0. Salir"));

                    switch (opcion1) {
                        case 1:
                            //Ver productos fabricados por defecto
                            for (Robot i : robotList) {
                                System.out.println(i.print() + "\n");
                            }
                            System.out.println("-----------------------------------------");
                            break;
                        case 2:
                            int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("1. Sillon | 2. Sombrilla\n3. Escritorio"
                                    + " | 4. Silla \n5. Ventilador | 6. Mesa para Comedor"));

                            switch (opcion2) {
                                case 1:
                                    carrito.add(new Sillon("Cuero", "Estado 10/10", 200, "Negro", "Mediano"));
                                    System.out.println("Sillon Agregado al carrito...");
                                    break;
                                case 2:
                                    carrito.add(new Sombrilla(15, 20, "Estampado", "Grande"));
                                    System.out.println("Sobrilla Agregada al carrito...");
                                    break;
                                case 3:
                                    carrito.add(new Escritorio(50, 200, "Cafe", "Grande", "Madera"));
                                    System.out.println("Escritorio Agregado al carrito...");
                                    break;
                                case 4:
                                    carrito.add(new Silla(80, 80, "Rojo", "Metal"));
                                    System.out.println("Silla Agregada al carrito...");
                                    break;
                                case 5:
                                    carrito.add(new Ventilador(3, 85, "Blanco", "Mediano"));
                                    System.out.println("Ventilador Agregado al carrito...");
                                    break;
                                case 6:
                                    carrito.add(new MesaComedor(4, 180, "Gris", "Vidrio"));
                                    System.out.println("Mesa para Comedor Agregada al carrito...");
                                    break;
                                default:
                                    //Sale del menu
                                    System.out.println("Error, Seleccione una opcion valida");
                                    break;
                            }
                    }
                    break;

                //Termina opcion 1 del menu principal----------------------------------------------------------------------------
                case 2://Opcion 2 del menu principal

                    int opcion3;

                    do {
                        opcion3 = Integer.parseInt(JOptionPane.showInputDialog("1. Sillon | 2. Sombrilla\n "
                                + "3. Escritorio" + " | 4. Silla \n5. Ventilador | 6. Mesa para Comedor \n0. Salir"));

                        switch (opcion3) {
                            case 1:
                                carrito.add(new Sillon());
                                System.out.println("Sillon Agregado al carrito...");
                                break;
                            case 2:
                                carrito.add(new Sombrilla());
                                System.out.println("Sobrilla Agregada al carrito...");
                                break;
                            case 3:
                                carrito.add(new Escritorio());
                                System.out.println("Escritorio Agregado al carrito...");
                                break;
                            case 4:
                                carrito.add(new Silla());
                                System.out.println("Silla Agregada al carrito...");
                                break;
                            case 5:
                                carrito.add(new Ventilador());
                                System.out.println("Ventilador Agregado al carrito...");
                                break;
                            case 6:
                                carrito.add(new MesaComedor());
                                System.out.println("Mesa para Comedor Agregada al carrito...");
                                break;
                            default:
                                //Sale del menu
                                System.out.println("Saliendo...\n");
                                break;
                        }
                    } while (opcion3 != 0);
                    break;

                case 3: //Opcion para ver el carrito

                    System.out.println("CARRITO DE COMPRAS\n");
                    for (Robot i : carrito) {
                        System.out.println(i.print() + "\n");
                    }

                    int opcion4 = Integer.parseInt(JOptionPane.showInputDialog("Desea proceeder con la compra?\n"
                            + " 1. Si | 2. No "));

                    if (opcion4 == 1) {

                        for (Robot i : carrito) {
                            suma = suma + i.getPrecio();
                        }
                        System.out.println("Total a pagar = " + suma);
                        System.out.println("Pagando... Gracias por su compra");
                        carrito.clear();//Se limpia la lista
                    } else {
                        System.out.println("Saliendo...");
                    }
                    break;
            }
        } while (opcion != 0);
    }
}
