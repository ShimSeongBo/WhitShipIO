public class ParentTest {
    class Parent {}
    class Child extends Parent {}

    void run() {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(child instanceof Parent); //True
        System.out.println(parent instanceof Child); //False
    }
}
