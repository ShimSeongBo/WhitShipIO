package FunctionalInterfaceTest;

import static java.lang.Math.max;

@FunctionalInterface
public interface MyFunction {
    int max(int a, int b);
}

class anonymous {
    public static void main(String[] args) {
        MyFunction f = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return Math.max(a, b);
            }

            MyFunction f = (a, b) -> a > b ? a : b ;

        };
        System.out.println(Math.max(1, 2));
        System.out.println(f.max(1,2));
    }
}
