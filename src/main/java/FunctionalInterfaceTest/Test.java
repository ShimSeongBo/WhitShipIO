package FunctionalInterfaceTest;

public class Test {

    public static void main(String[] args) {
        Addition add = test();
        System.out.println(add.addition(1,2));

    }

    static Addition test() {
        return (i1, i2) -> i1 + i2;
    }
}
