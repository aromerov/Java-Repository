package tallerlistas;

import java.util.Comparator;

public class SortByDescription implements Comparator<Ticket> {

    //Algoritmo de Ordenamiento - Comparador para dos Objetos y los acomoda por Description
    @Override
    public int compare(Ticket descrip1, Ticket descrip2) {
        return descrip1.getDescription().compareToIgnoreCase(descrip2.getDescription());
    }

}
