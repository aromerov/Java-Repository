//Ver Tickets y Agregar Tickets
package tallerlistas;

import javax.swing.JOptionPane;

public class Ticket {

    //Agregar Tiquetes
    private int id;//id of the Ticket
    private String name;//Nombre del que toma el tiquete
    private String description;//Breve descripcion
    private String priority;//urgente, media, baja
    private String department;//Tech support, general assistance, payroll, Sales
    private String state; //Abierto, cerrado

    //Ver Tiquetes
    //Se debe ordenar los tiquetes por numero, nombre de la persona, descripcion, prioridad, departamento y estado
    //Ademas debe tener la opcion de mostrar solo los tiquetes abiertos y cerrados o ambos
    //Constructor para objeto Ticket con todos los atributos
    public Ticket(int id, String name, String description, String priority, String department, String state) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.department = department;
        this.state = state;
    }

    //Constructor para objeto Ticket con solo el atributo de estado
    public Ticket(String state) {
        this.state = state;
    }

    //Constructor vacio, contiene un metodo para crear un nuevo Objeto Ticket
    public Ticket() {
        createTicket();
    }

    //Metodo para imprimir toda la informacion del ticket
    public String print() {
        return "||CRM SERVICE - TICKET INFORMATION||\n"
                + "ID: " + id + " | Associate Name: " + name + "\n"
                + "Description: " + description + " | Priority: " + priority + "\n"
                + "Department: " + department + " | State: " + state;
    }

    //Metodo para asignar valores a las variables para poder crear un tiquete
    public void createTicket() {
        try {
            JOptionPane.showMessageDialog(null, "||Creacion del Tiquete||");
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de tiquete: "));
            name = JOptionPane.showInputDialog("Ingrese el nombre de la persona a cargo: ");
            description = JOptionPane.showInputDialog("Ingrese una breve descripcion: ");
            priority = JOptionPane.showInputDialog("Ingrese la prioridad del caso: ");
            department = JOptionPane.showInputDialog("Ingrese el departamento a cargo: ");
            state = JOptionPane.showInputDialog("Ingrese el estado del tiquete: ");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERROR: INGRESO ALGO MAL, INTENTELO DE NUEVO");
        }
    }

    //METODOS GET
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getPriority() {
        return priority;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getState() {
        return state;
    }
    
}
