package abstractTony;

abstract class Animal {
   // public abstract String show(String name);
    public abstract void show();
    public void age() {
        System.out.println("20살");
    }
}

class Dog extends Animal {
      public void show() {
        System.out.println("짖어!");
    }
}

public class Test {
    public static void main(String[] args) {
      // Animal animal = new Animal(); 추상 클래스는, 인스턴스를 생성할 수 없음.
        Dog doggy = new Dog();
            doggy.show();
    }
}
