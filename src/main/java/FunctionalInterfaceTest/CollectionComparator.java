package FunctionalInterfaceTest;

import java.util.Arrays;
import java.util.List;

public class CollectionComparator {

    List<String> list = Arrays.asList("a", "b", "c", "d", "e");

    // Collections.sort(list, (s1, s2) -> s2.compareTo(s2));
}

interface Comparator<T> {
    int compare(T o1, T o2);
}
