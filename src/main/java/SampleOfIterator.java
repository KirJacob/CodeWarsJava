import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class SampleOfIterator {
    public static void main(String[] args) {
        ArrayList <String>arrayList = new ArrayList();
        arrayList.add("UA");arrayList.add("RU");arrayList.add("PL");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
