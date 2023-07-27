import java.util.*;
public class Main {
    public static void main(String[] args) {
        String napis = "this is a test of the emergency broadcast system this is only a test";
        String[] slowa = napis.split(" ");
        Map<String, Integer> listaJJa = new LinkedHashMap<>();

        for (int i = 0; i < slowa.length; i++) {
            if (listaJJa.containsKey(slowa[i])) {
                listaJJa.put(slowa[i], listaJJa.get(slowa[i]) +1);
            } else {
                listaJJa.put(slowa[i],1);
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = listaJJa.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println(listaJJa.get(slowa[0]));
    }
}
