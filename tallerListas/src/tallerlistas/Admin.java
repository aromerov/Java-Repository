package tallerlistas;

import javax.swing.JOptionPane;

public class Admin {

    int opcion;
    Build build = new Build();

    //Metodo para ejecutar un menu
    public void menu() {

        //Instancia de Build para agregar los Objetos por defecto al ArrayList
        build.buildList();
        //build.print();

        //Bucle Do While para poder crear un menu interactivo
        do {
            //Variable que va guardar el valor que ingrese el usuario como opcion para enviar el switch
            opcion = Integer.parseInt(JOptionPane.showInputDialog("       ||MENU DE OPCIONES||\n"
                    + "1. Imprimir Informacion\n2. Crear nuevo Tiquete\n\nVer Tiquetes ordenados por:\n  3. ID\n  4. Nombre\n  5. Descripcion\n  6. Prioridad\n"
                    + "  7. Departamento\n  8. Estado\n\n0. Salir"));

            //Condicional Switch Case para ejecutar las opciones del Menu
            switch (opcion) {

                case 1://Imprime la informacion de la Lista
                    build.print();
                    break;

                case 2://Opcion 2 para crear un nuevo Objeto e imprime todos los Objetos con el metodo print()
                    build.addNewObject();
                    JOptionPane.showMessageDialog(null, "NUEVO OBJETO CREADO!");
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                case 3://Opcion 3 para acomodar los Objetos por ID y los imprime con el metodo print()
                    build.sortById();
                    build.print();
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                case 4://Opcion 4 para acomodar los Objetos por Nombre y los imprime con el metodo print()
                    build.sortByName();
                    build.print();
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                case 5://Opcion 5 para acomodar los Objetos por Description y los imprime con el metodo print()
                    build.sortByDescription();
                    build.print();
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                case 6://Opcion 6 para acomodar los Objetos por Prioridad y los imprime con el metodo print()
                    build.sortByPriority();
                    build.print();
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                case 7://Opcion 7 para acomodar los Objetos por Departamento y los imprime con el metodo print()
                    build.sortByDepartment();
                    build.print();
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                case 8://Opcion 8 para acomodar los Objetos por Estado y los imprime con el metodo print()
                    build.sortByState();
                    build.print();
                    System.out.println("*****************************");
                    System.out.println("*****************************");
                    break;

                default://Sino se sale del menu
                    System.out.println("SALIENDO DEL PROGRAMA...");
                    break;
            }

        } while (opcion != 0);
    }
}
