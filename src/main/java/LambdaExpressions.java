import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressions {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.forEach( (n) -> {
            System.out.println(n);
        });

        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };

        numbers.forEach( method );

        Consumer<Integer> display = n -> {
            System.out.println(n);
        };
        display.accept(10);

        Consumer<List<Integer>> modify = list ->
        {
            for (int i=0; i<list.size(); i++)
                list.set(1, 2 * list.get(i));
        };

        Consumer<List<Integer>>
                dispList = list -> list.stream().forEach( a -> System.out.println(a + " "));
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        modify.accept(list);
        dispList.accept(list);

    }
}
