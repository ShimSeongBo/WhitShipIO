import java.util.*;

public class iterableTest {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Larry", "Steve");
        names.forEach(System.out::println);

        Set<String> uniqueNames = new HashSet<>(Arrays.asList("Shim", "Seong", "bo"));
        uniqueNames.forEach(System.out::println);

        uniqueNames.forEach(n-> {System.out.println(n);});

        Queue<String> namesQueue = new ArrayDeque<>(Arrays.asList("shim", "seong", "bo"));
        namesQueue.forEach( n -> {
            System.out.println(n);
        });


    }
}
