import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class CreateMapExam {
    public static void main(String[] args) {

        Map<Integer, String> namesMap = new HashMap<>();

        namesMap.put(5000, "Americano");
        namesMap.put(5500, "Americano");
        namesMap.put(6000, "Americano");

        Consumer<String> consumer = (i) -> {
            System.out.println(i);
        };

        namesMap.forEach( (n,n2) -> {
            System.out.println(n + "," + n2);
        });
    }
}
