import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// plik prezentuje różne metody wyświetlania i iterowania po liście ArrayList

public class Arraylist {
    public static void main(String[] args) {
        //jak iterowac po liscie
        ArrayList<String> array = new ArrayList<String>();
        array.add("Janusz");
        System.out.println(array);

        //to jest złe podejście (String i int razem):
        List list = new ArrayList<String>();            //musi byc wszystko abtrakcyjne, to jest interface
        list.add("1");
        list.add("Ola");

        //metody wyświetlania:
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));            //get jest mało wydajny

        }
        //for each:
        for (Object s : list) {                        //nie wiemy, jak ta iteracja przebiega
            System.out.println(s);
        }
        //uogólnienie List pozwala na bezproblemową zmianę w przyszłości np. na Linked lub inny
        //nie powinniśmy dodawać różnych typów do jednej listy, brak kontroli nad typami (w tablicy jest int i String)

        //można określić typ:
        List<String> imiona = new ArrayList<>();
        imiona.add("JAn");
        imiona.add("Janek");
        imiona.remove("Janek");
        for (String s : imiona) {
            System.out.println(s);
        }

        //metoda wyswietlania 1:
        //while sterowana jest przez hasNext, nie dobre jest że obiekt iteratora jest zadeklarowany poza pętlą,
        //ale można złapać to w blok kodu, ale jest to pewne obejście problemu:
//        {
//                while(it.hasNext()){
//                    String s = it.next();
//                    System.out.println(s);
//                }
//        }

        //ITERATOR: skacze po liscie
        //hasNext() czy jest cos przed nim, sprawdza
        //next() skacze, nawet w przepaść
        //remove()

        //metoda wyswietlania 2:
        //lepiej użyć for i dać obiekt iterator do pętli!!(nie będzie dostępny poza pętlą)
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        //        for(Iterator<Player> it = players.iiterator(); it.hasNext();){         //for(;;) pętla nieskończona
//          Player p  = it.next();
//          if(p.getName().equals(name)){
//          it.remove();
//          break;
//          }
//        }

        ///metoda wysiwetlania 3:
        list.forEach(s -> System.out.println(s));

        //metoda 3.1.
        list.forEach(System.out::println);

//        Inny przykład:
//        printPlayer(){
//            for(String s : players){
//                System.out.println(s);
//            }
//        }

        //metoda usuwania:
        // players.removeIf(player -> player.getName().equals(name));
    }
}
