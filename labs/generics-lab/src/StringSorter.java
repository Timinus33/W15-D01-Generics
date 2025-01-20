import java.util.Comparator;
import java.util.List;

public class StringSorter implements Sortable<String> {
    @Override
    public void sort(List<String> items) {
        items.sort(Comparator.comparing(String::toString));
    }
}
