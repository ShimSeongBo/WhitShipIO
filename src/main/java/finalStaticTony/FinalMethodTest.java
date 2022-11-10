package finalStaticTony;

public class FinalMethodTest {
    final void method() {
        System.out.println("This is a final method.");
    }
}

class FinalMethodTestB extends FinalMethodTest {
    // void method() { } -> final 메서드일 경우 Override 금지.

}