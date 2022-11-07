package FunctionalInterfaceTest;

public class Zoo {
    interface Animal {
        void sound();
    }

    static class Dog implements Animal {

        @Override
        public void sound() {
            System.out.println("멍멍");
        }
        public void run() {
            System.out.println("멍멍멍");
        }
    }

    static class Cat implements Animal {

        @Override
        public void sound() {
            System.out.println("야옹");
        }

        public void run() {
            System.out.println("냥냥");
        }
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        Cat cat = new Cat();

        dog.sound();
        cat.sound();
        ((Dog)dog).run();

        cat.run();
    }
}
