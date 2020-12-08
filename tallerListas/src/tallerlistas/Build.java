package tallerlistas;

import java.util.ArrayList;
import java.util.Collections;

public class Build {

    //Lista de Objetos de tipo Ticket
    ArrayList<Ticket> ticketList;

    //Constructor vacio donde se incializa el ArrayList
    public Build() {
        ticketList = new ArrayList<>();
    }

    public void buildList() {

        //String name, String description, String priority, String department, String state
        ticketList.add(new Ticket(12,"Alexander Araya", "Documento BCP", "Bajo", "General Assistance", "Abierto"));
        ticketList.add(new Ticket(38,"Carolina Rojas", "Pago de Capacitacion", "Media", "Payroll", "Cerrado"));
        ticketList.add(new Ticket(35,"Andres Vargas", "Windows Error", "Urgente", "Technical Support", "Abierto"));
        ticketList.add(new Ticket(2,"Veronica Solis", "Password Reset", "Media", "Tachnical Support", "Abierto"));
        ticketList.add(new Ticket(44,"Victor Vega", "Precio de Producto", "Urgente", "Sales Department", "Cerrado"));
        //ticketList.add(new Ticket("Carmen Cubero", "Solicitud de Implementacion", "Media", "Sales Department", "Abierto"));
    }

    //Metodo para agregar un objeto a la lista creado por el usuario.
    public void addNewObject() {
        ticketList.add(new Ticket());
    }

    //Metodo para imprimir la informacion de cada objeto
    public void print() {

        //Bucle for que recorre todo el Array y guarda la informacion del Objeto en "i"
        for (Ticket i : ticketList) {
            //se llama el metodo print() declarado en la clase "Ticket"
            System.out.println(i.print());
            System.out.println("______________________________");
        }
        //Method to sort by ID

    }

    //Metodo para acomodar los Objetos por el "ID"
    public void sortById() {
        Collections.sort(ticketList, new SortById());
    }

    //Metodo para acomodar los Objetos por el "Name"
    public void sortByName() {
        Collections.sort(ticketList, new SortByName());
    }

    //Metodo para acomodar los Objetos por el "Description"
    public void sortByDescription() {
        Collections.sort(ticketList, new SortByDescription());
    }

    //Metodo para acomodar los Objetos por el "Priority"
    public void sortByPriority() {
        Collections.sort(ticketList, new SortByPriority());
    }

    //Metodo para acomodar los Objetos por el "Department"
    public void sortByDepartment() {
        Collections.sort(ticketList, new SortByDepartment());
    }

    //Metodo para acomodar los Objetos por el "State"
    public void sortByState() {
        Collections.sort(ticketList, new SortByState());
    }

}
