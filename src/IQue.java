/*
Interfejs IQue postuluje nastepujące metody:
 pushItem(Object)        - dodaje element do kolejki na dozwolone miejsce
 popItem()               - pobiera pierwszy dozwolony element i usuwa go z kolejki
 removeItem()            - tylko usuwa element z kolejki bez zwracania
 getSize()               - pokazuje długość kolejki
 showItem()              - pokazuje pierwszy dozwolony element w kolejce
 showAllItems()          - pokazuje wszystkie elementy w kolejce (od pierwszego do pobrania)
 name()                  - pokazuja bieżącą nazwę kolejki
 setName(String)         - ustawia\zmienia nazwę kolejki

*/

public interface IQue {

    void pushItem(Object obj);
    Object popItem();
    void removeItem();
    int getSize();
    void showItem();
    void showAllItems();
    String name();
    void setName(String name);
}
