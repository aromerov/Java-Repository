package tallerlistas;

import java.util.Comparator;

public class SortByPriority implements Comparator<Ticket> {

    //Algoritmo de Ordenamiento - Comparador para dos Objetos y los acomoda por Priority
    @Override
    public int compare(Ticket priority1, Ticket priority2) {
        return priority1.getPriority().compareToIgnoreCase(priority2.getPriority());
    }

}
