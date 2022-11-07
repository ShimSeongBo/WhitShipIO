package FunctionalInterfaceTest;

public class StrongWeak {

    static class A {
        public void methodA(B b) {
            b.methodB();
        }
    }

    static class B{
        public void methodB() {
            System.out.println("methodB()");
        }
    }

    static class InterfaceTest {
        public static void main(String[] args) {
            A a = new A();
            a.methodA(new B());

        }
    }
}
