package overridingTony;



class Parent {
    void display() {
        System.out.println("Parent의 display() 메서드");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child의 display() 메서드");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent pa = new Parent();
        pa.display(); //Parent의 display() 메서드
        Child ch = new Child();
        ch.display(); //Child의 display() 메서드
        Parent pc = new Child();
        pc.display(); //Parent의 display() 메서드 ????..x
    }
}
