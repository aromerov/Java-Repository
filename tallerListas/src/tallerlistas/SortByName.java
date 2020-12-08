package tallerlistas;

import java.util.Comparator;

public class SortByName implements Comparator<Ticket> {

    //Algoritmo de Ordenamiento - Comparador para dos Objetos y los acomoda por Name
    @Override
    public int compare(Ticket name1, Ticket name2) {
        return name1.getName().compareToIgnoreCase(name2.getName());
    }
}
