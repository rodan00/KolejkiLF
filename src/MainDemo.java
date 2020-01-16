
/*
Program:
1. stosuję interfejs klas kolejek
2. używam zmiennej interfejsowej typu IQue do implementacji klas kolejek,
3. zdefiniowałem dwie klasy QueFifo i QueLife implementujące
   interfejs IQue do podmiany w linii 16
*/

public class MainDemo {

    public static void main(String[] args) {

        Object item;

        IQue kolejka=new QueLifo();   // or =new QueFifo

        print("rozmiar pustej kolejki: ", kolejka.getSize());
        print("nazwa pustej kolejki: ", kolejka.name());
        System.out.println();

        kolejka.setName("kolejka zbudowana");
        kolejka.pushItem("Pierwszy element");
        kolejka.pushItem(2);
        kolejka.pushItem(3.14);
        kolejka.pushItem("Czwarty element");
        for (int i=5; i<9; i++){ kolejka.pushItem(i*11); }
        kolejka.setName("kolejka zbudowana");
        kolejka.showAllItems();
        System.out.println();

        kolejka.removeItem();
        print("usuwam kolejny w ciemno ","");
        kolejka.removeItem();
        print("usuwam kolejny w ciemno","");
        item = kolejka.popItem();
        print("pobieram następny : ", item);
        item = kolejka.popItem();
        print("pobieram następny : ", item);
        kolejka.pushItem(1111);
        kolejka.pushItem("przyszedłem ostatni a jestem ???");

        System.out.println();
        kolejka.setName("kolejka po przejściach");
        kolejka.showAllItems();

    }

    static void print (String text, Object obj){
        System.out.println(text + obj);
    }


}
