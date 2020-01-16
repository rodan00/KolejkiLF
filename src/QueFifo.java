
/*
Klasa QueFifo:
1. definiuje kolejkę typu FIFO składającą się z dowolnych obiektów (Object),
2. implementuje metody interfejsu IQue.
*/


import java.util.ArrayList;

public class QueFifo implements IQue{

    private ArrayList queFifo;
    private String name="NoName - FIFO";

    public QueFifo() {
        queFifo = new ArrayList<>();
    }

    public QueFifo(String name) {
        this();
        this.name=name+" - FIFO";
    }

    public Object popItem(){
        if (queFifo.size() > 0) {
            Object tmp = queFifo.get(0);
            removeItem();
            return tmp;
        } else
            System.out.println("INFO: Sorry - Que is empty");
        return null;
    }

    public void pushItem(Object item){
        queFifo.add(item);
        //System.out.println("INFO: Element has been added to "+name);
    }

    public void removeItem(){
        if (queFifo.size()==0) {
            System.out.println("INFO: Nothing to remove, " + name+ " is empty");
        }
        queFifo.remove(0);
        //System.out.println("INFO: Element has been removed from the Que :"+name);
    }

    public void showItem() {
        System.out.println(queFifo.get(0));
    }

    public void showAllItems() {
        System.out.println("INFO: All elements of Que :  "+ name);
        for (int i=0; i<queFifo.size(); i++ ) {
            int pozycja=i;
            System.out.println(pozycja+". "+queFifo.get(i));
        }
    }

    public int getSize(){
        return queFifo.size();
    }

    public void setName(String name){
        this.name=name + " - FIFO";
    }

    public String name(){
        return this.name;
    }

}
