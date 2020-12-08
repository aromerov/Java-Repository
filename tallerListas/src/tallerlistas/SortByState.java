package tallerlistas;

import java.util.Comparator;

public class SortByState implements Comparator<Ticket> {

    //Algoritmo de Ordenamiento - Comparador para dos Objetos y los acomoda por State
    @Override
    public int compare(Ticket state1, Ticket state2) {
        return state1.getState().compareToIgnoreCase(state2.getState());
    }

}
