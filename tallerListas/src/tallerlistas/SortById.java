
package tallerlistas;

import java.util.Comparator;

public class SortById implements Comparator<Ticket> {

    //Algoritmo de Ordenamiento - Comparador para dos Objetos y los acomoda por ID
    @Override
    public int compare(Ticket id1, Ticket id2) {
        if (id1.getId() > id2.getId()) {
            return 1;
        } else if (id1.getId() < id2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }

}
