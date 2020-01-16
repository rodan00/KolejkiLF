
/*
Klasa QueLifo:
1. definiuje kolejkę typu LIFO składającą się z dowolnych obiektów (Object),
2. implementuje metody interfejsu IQue.
*/

import java.util.ArrayList;

public class QueLifo implements IQue {

    private ArrayList queLifo;
    private String name="NoName - LIFO";

    public QueLifo() {
        queLifo = new ArrayList<>();
    }

    public QueLifo(String name) {
        this();
        this.name=name+" - LIFO";
    }

    public Object popItem(){
        if (queLifo.size() > 0) {
            Object tmp = queLifo.get(queLifo.size()-1);
            removeItem();
            return tmp;
        } else
            System.out.println("INFO: Sorry - Que is empty");
        return null;
    }

    public void pushItem(Object item){
        queLifo.add(item);
        //System.out.println("INFO: Element has been added to "+name);
    }

    public void removeItem(){
        if (queLifo.size()==0) {
            System.out.println("INFO: Nothing to remove, " + name+ " is empty");
        };
        queLifo.remove(queLifo.size()-1);
        //System.out.println("INFO: Element has been removed from the Que :"+name);
    }

    public void showItem() {
        System.out.println(queLifo.get(queLifo.size()-1));
    }

    public void showAllItems() {
        System.out.println("INFO: All elements of Que :  "+ name);
        for (int i=queLifo.size()-1; i>= 0 ; i-- ) {
            int pozycja=queLifo.size()-i;
            System.out.println(pozycja+". "+queLifo.get(i));
        }
    }

    public int getSize(){
        return queLifo.size();
    }

    public void setName(String name){
        this.name=name + " - LIFO";
    }

    public String name(){
        return this.name;
    }


}
