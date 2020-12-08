package tallerlistas;

import java.util.Comparator;

public class SortByDepartment implements Comparator<Ticket> {

    //Algoritmo de Ordenamiento - Comparador para dos Objetos y los acomoda por Department
    @Override
    public int compare(Ticket depart1, Ticket depart2) {
        return depart1.getDepartment().compareToIgnoreCase(depart2.getDepartment());
    }

}
