package chapter17.containers.task7;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<String> array = new ArrayList<>();
        List<String> arrayList = CountriesName(array, 10);
        System.out.println("ArrayList : " + arrayList);

        List<String> linked = new LinkedList<>();
        List<String> linkedList = CountriesName(linked, 10);
        System.out.println("LinkedList : " + linkedList);

        ListIterator<String> arrayListIterator = arrayList.listIterator();
        ListIterator<String> linkedListIterator = linkedList.listIterator();

        inverseInsertion(arrayListIterator, linkedListIterator);

        System.out.println("Insertion" + arrayList);
    }

    public static void inverseInsertion(ListIterator<String> aIte, ListIterator<String> lIte){
        while (aIte.hasNext()){
            aIte.next();
        }
        while (aIte.hasPrevious()){
            aIte.previous();
            if (lIte.hasNext()){
                aIte.add(lIte.next() + "_2");
                aIte.previous();
            }
        }
        while (lIte.hasNext()) {
            aIte.add(lIte.next());
        }
    }

    public static List<String> CountriesName(List<String> list, int size){
        Map<String,String> countriesMap = new HashMap<String, String>(new Countries());
        List<String> tempList = new ArrayList<>();
        for (Map.Entry<String, String> entry : countriesMap.entrySet()) {
            tempList.add(entry.getKey());
        }
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(tempList.get(random.nextInt(tempList.size())));
        }
        return list;
    }
}
